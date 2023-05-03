package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Objectif;
import com.gouv.sos.service.IObjectifService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectifServiceImpl implements IObjectifService {
    @Override
    public Objectif getObjectif(Long idObjectif) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Objectif updateObjectif(Objectif objectif) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Objectif addObjectif(Objectif objectif) {
        return null;
    }

    @Override
    public void deleteObjectif(Long idObjectif) {

    }

    @Override
    public List<Objectif> getAllObjectif() {
        return null;
    }
}
