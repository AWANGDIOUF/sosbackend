package com.gouv.sos.repository;

import com.gouv.sos.entities.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface IObjectifRepository extends JpaRepository<Objectif, Long> {
    @Query(value = "select objectif from Objectif objectif where objectif.entreprise.idEntreprise =:idEntreprise")
    List<Objectif> AllObjectifs(@Param("idEntreprise") Long idEntreprise);
}
