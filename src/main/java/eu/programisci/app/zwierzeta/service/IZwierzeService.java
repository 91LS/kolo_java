package eu.programisci.app.zwierzeta.service;

import eu.programisci.app.zwierzeta.dto.NoweZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeCritDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeNazwaIWiekDTO;
import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;

import java.util.List;

/*
 * Created by student on 15.06.17.
 */
public interface IZwierzeService {

    ZwierzeDTO findOne(Long id);

    List<ZwierzeDTO> findAllForTable();

    void deleteOne(Long id);

    ZwierzeDTO save(ZwierzeDTO zwierzeDTO);

    List<ZwierzeDTO> znajdzStarszeNiz(Integer aWiek);

    List<ZwierzeDTO> znajdzWgGatunku(EGatunek aGatunek);

    List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(String aPartial);

    NoweZwierzeDTO saveNowe(NoweZwierzeDTO zZwierzeDTO);

    List<ZwierzeNazwaIWiekDTO> znajdzZCoNajmniejJednymOkiemWKolorze(String aKolor);

    List<ZwierzeDTO> znajdzSamcowGatunkuStarszychNiz(ZwierzeCritDTO zZwierzeDTO);
}
