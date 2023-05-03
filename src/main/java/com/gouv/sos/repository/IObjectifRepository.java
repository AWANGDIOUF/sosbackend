package com.gouv.sos.repository;

import com.gouv.sos.entities.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IObjectifRepository extends JpaRepository<Objectif, Long> {
}
