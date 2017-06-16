package eu.programisci.app.zwierzeta.dto;

import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.enums.EPlec;

/**
 * Created by student on 15.06.17.
 */
public class ZwierzeDTO {

    private Long id;
    private String nazwa;
    private EGatunek gatunek;
    private EPlec plec;
    private Integer wiek;

    public ZwierzeDTO(){
    }

    public ZwierzeDTO(String nazwa, EGatunek gatunek, EPlec plec, Integer wiek) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.plec = plec;
        this.wiek = wiek;
    }

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

}
