package com.gouv.sos.repository;

import com.gouv.sos.entities.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartenaireRepository extends JpaRepository<Partenaire, Long> {
}
