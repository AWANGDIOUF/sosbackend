package com.gouv.sos.service;

import com.gouv.sos.entities.Evenement;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IEvenementService {

    Evenement getEvenement(Long idEvenement) throws ResourceNotFoundException;
    Evenement updateEvenement( Evenement evenement) throws ResourceNotFoundException;
    Evenement addEvenement(Evenement evenement);
    void deleteEvenement(Long idEvenement);
    List<Evenement> getAllEvenement();
}
