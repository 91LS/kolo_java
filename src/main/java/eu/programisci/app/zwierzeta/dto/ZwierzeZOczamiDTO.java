package eu.programisci.app.zwierzeta.dto;

import eu.programisci.app.zwierzeta.enums.EGatunek;

/**
 * Created by student on 16.06.17.
 */
public class ZwierzeZOczamiDTO {

    private Long id;
    private String nazwa;
    private EGatunek gatunek;
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
