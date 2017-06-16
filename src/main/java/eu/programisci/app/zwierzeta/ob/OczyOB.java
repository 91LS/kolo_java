package eu.programisci.app.zwierzeta.ob;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by student on 16.06.17.
 */
@Entity
@Table(name = "oczy")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_oczy_id")
public class OczyOB {



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "kolor_lewego_oka")
    private String kolor_lewego_oka;

    @Column(name = "kolor_prawego_oka")
    private String kolor_prawego_oka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKolor_lewego_oka() {
        return kolor_lewego_oka;
    }

    public void setKolor_lewego_oka(String kolor_lewego_oka) {
        this.kolor_lewego_oka = kolor_lewego_oka;
    }

    public String getKolor_prawego_oka() {
        return kolor_prawego_oka;
    }

    public void setKolor_prawego_oka(String kolor_prawego_oka) {
        this.kolor_prawego_oka = kolor_prawego_oka;
    }

}
