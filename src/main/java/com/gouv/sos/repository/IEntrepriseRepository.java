package com.gouv.sos.repository;

import com.gouv.sos.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntrepriseRepository extends JpaRepository<Entreprise, Long> {
}
