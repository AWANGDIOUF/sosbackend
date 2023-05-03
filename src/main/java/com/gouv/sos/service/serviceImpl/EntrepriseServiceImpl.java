package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Entreprise;
import com.gouv.sos.service.IEntrepriseService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {
    @Override
    public Entreprise getEntreprise(Long idEntreprise) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Entreprise updateEntreprise(Entreprise entreprise) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Entreprise addEntreprise(Entreprise entreprise) {
        return null;
    }

    @Override
    public void deleteEntreprise(Long idEntreprise) {

    }

    @Override
    public List<Entreprise> getAllEntreprise() {
        return null;
    }
}
