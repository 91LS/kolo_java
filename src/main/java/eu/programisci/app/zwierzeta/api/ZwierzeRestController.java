package eu.programisci.app.zwierzeta.api;

import eu.programisci.app.zwierzeta.dto.NoweZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeCritDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeNazwaIWiekDTO;
import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import eu.programisci.app.zwierzeta.service.IZwierzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by student on 15.06.17.
 */
@RestController
@RequestMapping(value = "/api/zwierzeta")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ZwierzeRestController {

    @Autowired
    private IZwierzeService zwierzeService;

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ZwierzeDTO findOne(@RequestParam("id") Long aId) {
        return zwierzeService.findOne(aId);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeDTO> findAll() {
        return zwierzeService.findAllForTable();
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOne(@RequestParam("id") Long aId) {
        zwierzeService.deleteOne(aId);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ZwierzeDTO save(@RequestBody ZwierzeDTO zZwierzeDTO) {
        return zwierzeService.save(zZwierzeDTO);
    }

    @RequestMapping(value = "/saveNowe", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NoweZwierzeDTO save(@RequestBody NoweZwierzeDTO zZwierzeDTO) {
        return zwierzeService.saveNowe(zZwierzeDTO);
    }

    @RequestMapping(value = "/znajdzStarszeNiz", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeDTO> znajdzStarszeNiz(@RequestParam("wiek") Integer aWiek) {
        return zwierzeService.znajdzStarszeNiz(aWiek);
    }

    @RequestMapping(value = "/znajdzWgGatunku", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeDTO> znajdzWgGatunku(@RequestParam("gatunek") EGatunek aGatunek) {
        return zwierzeService.znajdzWgGatunku(aGatunek);
    }

    @RequestMapping(value = "/znajdzZwierzetaZImieniemZaczynajacymSieOd", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(@RequestParam("partial") String aPartial) {
        return zwierzeService.znajdzZwierzetaZImieniemZaczynajacymSieOd(aPartial);
    }

    @RequestMapping(value = "/znajdzZCoNajmniejJednymOkiemWKolorze", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeNazwaIWiekDTO> znajdzZCoNajmniejJednymOkiemWKolorze(@RequestParam("kolor") String aKolor) {
        return zwierzeService.znajdzZCoNajmniejJednymOkiemWKolorze(aKolor);
    }

    @RequestMapping(value = "/znajdzSamcowGatunkuStarszychNiz", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeDTO> znajdzSamcowGatunkuStarszychNiz(@RequestBody ZwierzeCritDTO zZwierzeDTO) {
        return zwierzeService.znajdzSamcowGatunkuStarszychNiz(zZwierzeDTO);
    }

}
