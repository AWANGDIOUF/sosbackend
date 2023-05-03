package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Evenement;
import com.gouv.sos.service.IEvenementService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementServiceImpl implements IEvenementService {
    @Override
    public Evenement getEvenement(Long idEvenement) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Evenement updateEvenement(Evenement evenement) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Evenement addEvenement(Evenement evenement) {
        return null;
    }

    @Override
    public void deleteEvenement(Long idEvenement) {

    }

    @Override
    public List<Evenement> getAllEvenement() {
        return null;
    }
}
