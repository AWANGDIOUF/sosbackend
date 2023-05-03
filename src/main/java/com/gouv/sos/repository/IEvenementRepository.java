package com.gouv.sos.repository;

import com.gouv.sos.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEvenementRepository extends JpaRepository<Evenement, Long> {
    @Query(value = "select evenement from Evenement evenement where evenement.entreprise.idEntreprise =:idEntreprise")
    List<Evenement> AllEntreprises(@Param("idEntreprise") Long idEntreprise);

}
