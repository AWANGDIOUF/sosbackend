package com.gouv.sos.repository;

import com.gouv.sos.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface IOffreRepository extends JpaRepository<Offre, Long> {

    @Query(value = "select offre from Offre offre where offre.service.idService =:idService")
    List<Offre> AllOffres(@Param("idService") Long idService);

}
