package com.gouv.sos.repository;

import com.gouv.sos.entities.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPartenaireRepository extends JpaRepository<Partenaire, Long> {
    @Query(value = "select partenaire from Partenaire partenaire where partenaire.entreprise.idEntreprise =:idEntreprise")
    List<Partenaire> AllPartenaires(@Param("idEntreprise") Long idEntreprise);
}
