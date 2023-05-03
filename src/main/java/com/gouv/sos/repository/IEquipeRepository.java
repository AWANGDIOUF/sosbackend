package com.gouv.sos.repository;

import com.gouv.sos.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEquipeRepository extends JpaRepository<Equipe, Long> {
    @Query(value = "select equipe from Equipe equipe where equipe.entreprise.idEntreprise =:idEntreprise")
    List<Equipe> AllEquipes(@Param("idEntreprise") Long idEntreprise);

}
