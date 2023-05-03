package com.gouv.sos.repository;

import com.gouv.sos.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Long> {
    @Query(value = "select service from Service service where service.entreprise.idEntreprise =:idEntreprise")
    List<Service> AllServices(@Param("idEntreprise") Long idEntreprise);
}
