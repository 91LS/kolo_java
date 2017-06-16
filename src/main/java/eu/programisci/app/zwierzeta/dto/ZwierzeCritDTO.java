package eu.programisci.app.zwierzeta.dto;

import eu.programisci.app.zwierzeta.enums.EGatunek;

/**
 * Created by student on 16.06.17.
 */
public class ZwierzeCritDTO {

    private Long id;
    private EGatunek gatunek;
    private Integer wiek;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(EGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}
