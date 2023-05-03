package com.gouv.sos.service;

import com.gouv.sos.entities.Entreprise;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IEntrepriseService {

    Entreprise getEntreprise(Long idEntreprise) throws ResourceNotFoundException;
    Entreprise updateEntreprise( Entreprise entreprise) throws ResourceNotFoundException;
    Entreprise addEntreprise(Entreprise entreprise);
    void deleteEntreprise(Long idEntreprise);
    List<Entreprise> getAllEntreprise();
}
