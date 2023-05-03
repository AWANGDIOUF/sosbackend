package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Equipe;
import com.gouv.sos.service.IEquipeService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements IEquipeService {
    @Override
    public Equipe getEquipe(Long idEquipe) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Equipe updateEquipe(Equipe Equipe) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return null;
    }

    @Override
    public void deleteEquipe(Long idEquipe) {

    }

    @Override
    public List<Equipe> getAllEquipe() {
        return null;
    }
}
