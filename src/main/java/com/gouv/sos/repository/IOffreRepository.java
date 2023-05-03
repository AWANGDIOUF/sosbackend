package com.gouv.sos.repository;

import com.gouv.sos.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOffreRepository extends JpaRepository<Offre, Long> {
}
