package eu.programisci.app.zwierzeta.ob;

import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.enums.EPlec;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by student on 15.06.17.
 */
@Entity
@Table(name = "zwierzeta")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_zwierzeta_id")
public class ZwierzeOB {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "data_utworzenia", columnDefinition = "TIMESTAMP")
    private Date data_utworzenia;

    @Column(name = "nazwa")
    private String nazwa;

    @Enumerated(EnumType.STRING)
    @Column(name = "gatunek")
    private EGatunek gatunek;

    @Enumerated(EnumType.STRING)
    @Column(name = "plec")
    private EPlec plec;

    @Column(name = "wiek")
    private Integer wiek;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "oczy_id")
    private OczyOB oczy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_utworzenia() {
        return data_utworzenia;
    }

    public void setData_utworzenia(Date data_utworzenia) {
        this.data_utworzenia = data_utworzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public EGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(EGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public EPlec getPlec() {
        return plec;
    }

    public void setPlec(EPlec plec) {
        this.plec = plec;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public OczyOB getOczy() {
        return oczy;
    }

    public void setOczy(OczyOB oczy) {
        this.oczy = oczy;
    }
}
