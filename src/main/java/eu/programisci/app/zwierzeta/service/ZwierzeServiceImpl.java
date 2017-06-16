package eu.programisci.app.zwierzeta.service;

import eu.programisci.app.zwierzeta.converters.ZwierzeConverter;
import eu.programisci.app.zwierzeta.dto.NoweZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeCritDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeNazwaIWiekDTO;
import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.ob.OczyOB;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import eu.programisci.app.zwierzeta.repository.IZwierzeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by student on 15.06.17.
 */
@Service
public class ZwierzeServiceImpl implements IZwierzeService{

    @Autowired
    private IZwierzeRepository zwierzeRepository;

    @Autowired
    private ZwierzeConverter zwierzeConverter;

    @Override
    public ZwierzeDTO findOne(Long id) {
        ZwierzeOB ob = zwierzeRepository.findOne(id);
        ZwierzeDTO dto = zwierzeConverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<ZwierzeDTO> findAllForTable() {
        List<ZwierzeOB> obList = zwierzeRepository.findAll();
        List<ZwierzeDTO> dtoList = zwierzeConverter.obListToDtoList(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        zwierzeRepository.delete(id);
    }

    @Override
    public ZwierzeDTO save(ZwierzeDTO dto) {
        if (dto.getId() == null) {
            return zwierzeConverter.obToDto(create(dto));
        } else {
            return zwierzeConverter.obToDto(update(dto));
        }
    }

    @Override
    public List<ZwierzeDTO> znajdzStarszeNiz(Integer aWiek) {
        List<ZwierzeOB> pOBList = zwierzeRepository.znajdzStarszeNiz(aWiek);
        List<ZwierzeDTO> pDTOList = zwierzeConverter.obListToDtoList(pOBList);
        return pDTOList;
    }

    @Override
    public List<ZwierzeDTO> znajdzWgGatunku(EGatunek aGatunek) {
        List<ZwierzeOB> pOBList = zwierzeRepository.znajdzWgGatunku(aGatunek);
        List<ZwierzeDTO> pDTOList = zwierzeConverter.obListToDtoList(pOBList);
        return pDTOList;
    }

    @Override
    public List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(String aPartial) {
        return zwierzeRepository.znajdzZwierzetaZImieniemZaczynajacymSieOd(aPartial);
    }

    @Override
    public NoweZwierzeDTO saveNowe(NoweZwierzeDTO dto) {
        if (dto.getId() == null) {
            return zwierzeConverter.obToNoweDto(create(dto));
        } else {
            return zwierzeConverter.obToNoweDto(update(dto));
        }
    }

    @Override
    public List<ZwierzeNazwaIWiekDTO> znajdzZCoNajmniejJednymOkiemWKolorze(String aKolor) {
        return zwierzeRepository.znajdzZCoNajmniejJednymOkiemWKolorze(aKolor);
    }

    @Override
    public List<ZwierzeDTO> znajdzSamcowGatunkuStarszychNiz(ZwierzeCritDTO dto) {
        List<ZwierzeOB> pOBList = zwierzeRepository.znajdzSamcowGatunkuStarszychNiz(dto.getGatunek(), dto.getWiek());
        List<ZwierzeDTO> pDTOList = zwierzeConverter.obListToDtoList(pOBList);
        return pDTOList;
    }

    private ZwierzeOB create(ZwierzeDTO dto) {
        ZwierzeOB ob = zwierzeConverter.dtoToOb(dto);
        ob.setData_utworzenia(new Date());
        ob = zwierzeRepository.save(ob);
        return ob;
    }

    private ZwierzeOB update(ZwierzeDTO dto) {
        ZwierzeOB ob = zwierzeRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setPlec(dto.getPlec());
        ob.setGatunek(dto.getGatunek());
        ob = zwierzeRepository.save(ob);
        return ob;
    }

    private ZwierzeOB create(NoweZwierzeDTO dto) {
        ZwierzeOB ob = zwierzeConverter.dtoToOb(dto);
        ob.setData_utworzenia(new Date());
        ob = zwierzeRepository.save(ob);
        return ob;
    }

    private ZwierzeOB update(NoweZwierzeDTO dto) {
        ZwierzeOB ob = zwierzeRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setPlec(dto.getPlec());
        ob.setGatunek(dto.getGatunek());
        OczyOB oczy = new OczyOB();
        oczy.setKolor_lewego_oka(dto.getKolorLewegoOka());
        oczy.setKolor_prawego_oka(dto.getKolorPrawegoOka());
        ob.setOczy(oczy);
        ob = zwierzeRepository.save(ob);
        return ob;
    }
}
