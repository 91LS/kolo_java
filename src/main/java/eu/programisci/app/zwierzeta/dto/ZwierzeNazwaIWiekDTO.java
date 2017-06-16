package eu.programisci.app.zwierzeta.dto;

/**
 * Created by student on 15.06.17.
 */
public class ZwierzeNazwaIWiekDTO {

    private Long id;
    private String nazwa;
    private Integer wiek;

    public ZwierzeNazwaIWiekDTO() {
    }

    public ZwierzeNazwaIWiekDTO(Long id, String nazwa, Integer wiek) {
        this.id = id;
        this.nazwa = nazwa;
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

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}
