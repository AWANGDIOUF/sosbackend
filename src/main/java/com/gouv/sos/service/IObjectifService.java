package com.gouv.sos.service;

import com.gouv.sos.entities.Objectif;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IObjectifService {

    Objectif getObjectif(Long idObjectif) throws ResourceNotFoundException;
    Objectif updateObjectif( Objectif objectif) throws ResourceNotFoundException;
    Objectif addObjectif(Objectif objectif);
    void deleteObjectif(Long idObjectif);
    List<Objectif> getAllObjectif();
}
