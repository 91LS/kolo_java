package eu.programisci.app.zwierzeta.converters;

import eu.programisci.app.zwierzeta.dto.NoweZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzeta.ob.OczyOB;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 15.06.17.
 */
@Service
public class ZwierzeConverter {

    public ZwierzeDTO obToDto(ZwierzeOB in) {
        ZwierzeDTO out = new ZwierzeDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setWiek(in.getWiek());
        out.setPlec(in.getPlec());
        return out;
    }

    public ZwierzeOB dtoToOb(ZwierzeDTO in) {
        ZwierzeOB out = new ZwierzeOB();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setWiek(in.getWiek());
        out.setPlec(in.getPlec());
        return out;
    }

    public List<ZwierzeDTO> obListToDtoList(List<ZwierzeOB> inList) {
        if (inList == null) {
            return null;
        }
        List<ZwierzeDTO> outList = new ArrayList<>();
        for (ZwierzeOB in : inList) {
            outList.add(obToDto(in));
        }
        return outList;
    }

    public NoweZwierzeDTO obToNoweDto(ZwierzeOB in) {
        NoweZwierzeDTO out = new NoweZwierzeDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setWiek(in.getWiek());
        out.setPlec(in.getPlec());
        out.setKolorLewegoOka(in.getOczy().getKolor_lewego_oka());
        out.setKolorPrawegoOka(in.getOczy().getKolor_prawego_oka());
        return out;
    }

    public ZwierzeOB dtoToOb(NoweZwierzeDTO in) {
        ZwierzeOB out = new ZwierzeOB();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setWiek(in.getWiek());
        out.setPlec(in.getPlec());
        OczyOB oczy = new OczyOB();
        oczy.setKolor_lewego_oka(in.getKolorLewegoOka());
        oczy.setKolor_prawego_oka(in.getKolorPrawegoOka());
        out.setOczy(oczy);
        return out;
    }

    public List<NoweZwierzeDTO> obListToNoweDtoList(List<ZwierzeOB> inList) {
        if (inList == null) {
            return null;
        }
        List<NoweZwierzeDTO> outList = new ArrayList<>();
        for (ZwierzeOB in : inList) {
            outList.add(obToNoweDto(in));
        }
        return outList;
    }
}
