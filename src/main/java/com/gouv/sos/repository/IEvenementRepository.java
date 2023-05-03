package com.gouv.sos.repository;

import com.gouv.sos.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEvenementRepository extends JpaRepository<Evenement, Long> {
}
