package com.gouv.sos.repository;

import com.gouv.sos.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipeRepository extends JpaRepository<Equipe, Long> {
}
