package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Objectif;
import com.gouv.sos.repository.IObjectifRepository;
import com.gouv.sos.service.IObjectifService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectifServiceImpl implements IObjectifService {

    private final IObjectifRepository objectifRepository;

    public ObjectifServiceImpl(IObjectifRepository objectifRepository) {
        this.objectifRepository = objectifRepository;
    }

    @Override
    public Objectif getObjectif(Long idObjectif) throws ResourceNotFoundException {
        return objectifRepository.findById(idObjectif).orElseThrow(()->new ResourceNotFoundException("Objectif n'existe pas"));
    }

    @Override
    public Objectif updateObjectif(Objectif objectif) throws ResourceNotFoundException {
        return objectifRepository.save(objectif);
    }

    @Override
    public Objectif addObjectif(Objectif objectif) {
        return objectifRepository.save(objectif);
    }

    @Override
    public void deleteObjectif(Long idObjectif) {
        objectifRepository.findById(idObjectif);
    }

    @Override
    public List<Objectif> getAllObjectif() {
        return objectifRepository.findAll();
    }

    @Override
    public List<Objectif> getAllObjectifEntreprise(Long idObjectif) throws ResourceNotFoundException {
        return objectifRepository.AllObjectifs(idObjectif);
    }

}
