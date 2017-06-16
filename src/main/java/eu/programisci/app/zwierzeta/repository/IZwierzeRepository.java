package eu.programisci.app.zwierzeta.repository;

import eu.programisci.app.zwierzeta.dto.NoweZwierzeDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeCritDTO;
import eu.programisci.app.zwierzeta.dto.ZwierzeNazwaIWiekDTO;
import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by student on 15.06.17.
 */
@Repository
public interface IZwierzeRepository extends JpaRepository<ZwierzeOB, Long>{

    @Query("SELECT z FROM ZwierzeOB z WHERE z.wiek > :wiek ORDER BY z.id ASC")
    List<ZwierzeOB> znajdzStarszeNiz(@Param("wiek") Integer aWiek);

    @Query("SELECT z FROM ZwierzeOB z WHERE z.gatunek LIKE :gatunek ORDER BY z.id ASC")
    List<ZwierzeOB> znajdzWgGatunku(@Param("gatunek") EGatunek aGatunek);

    @Query("SELECT new eu.programisci.app.zwierzeta.dto.ZwierzeNazwaIWiekDTO(z.id, z.nazwa, z.wiek) " +
            " FROM ZwierzeOB z " +
            " WHERE upper(z.nazwa) LIKE upper(concat(:partial, '%')) " +
            " ORDER BY z.id ASC")
    List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(@Param("partial") String aPartial);

    @Query("SELECT new eu.programisci.app.zwierzeta.dto.ZwierzeNazwaIWiekDTO(z.id, z.nazwa, z.wiek) " +
            " FROM ZwierzeOB z " +
            " LEFT JOIN z.oczy o " +
            " WHERE upper(o.kolor_lewego_oka) LIKE upper(concat('%', :kolor, '%')) " +
            " OR upper(o.kolor_prawego_oka) LIKE upper(concat('%', :kolor, '%')) " +
            " ORDER BY z.id ASC")
    List<ZwierzeNazwaIWiekDTO> znajdzZCoNajmniejJednymOkiemWKolorze(@Param("kolor") String aKolor);

    @Query("SELECT z FROM ZwierzeOB z " +
            " WHERE z.plec LIKE 'SAMIEC' " +
            " AND z.gatunek LIKE :gatunek " +
            " AND z.wiek > :wiek " +
            "ORDER BY z.id ASC")
    List<ZwierzeOB> znajdzSamcowGatunkuStarszychNiz(@Param("gatunek") EGatunek gatunek, @Param("wiek") Integer wiek);
}
