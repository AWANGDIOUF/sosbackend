package com.gouv.sos.service;

import com.gouv.sos.entities.Equipe;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IEquipeService {

    Equipe getEquipe(Long idEquipe) throws ResourceNotFoundException;
    Equipe updateEquipe( Equipe Equipe) throws ResourceNotFoundException;
    Equipe addEquipe(Equipe equipe);
    void deleteEquipe(Long idEquipe);
    List<Equipe> getAllEquipe();
}
