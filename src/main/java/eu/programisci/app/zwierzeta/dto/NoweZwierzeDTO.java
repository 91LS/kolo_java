package eu.programisci.app.zwierzeta.dto;

import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.enums.EPlec;

/**
 * Created by student on 16.06.17.
 */
public class NoweZwierzeDTO {

    private Long id;
    private String nazwa;
    private EGatunek gatunek;
    private EPlec plec;
    private Integer wiek;
    private String kolorLewegoOka;
    private String kolorPrawegoOka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getKolorLewegoOka() {
        return kolorLewegoOka;
    }

    public void setKolorLewegoOka(String kolorLewegoOka) {
        this.kolorLewegoOka = kolorLewegoOka;
    }

    public String getKolorPrawegoOka() {
        return kolorPrawegoOka;
    }

    public void setKolorPrawegoOka(String kolorPrawegoOka) {
        this.kolorPrawegoOka = kolorPrawegoOka;
    }
}
