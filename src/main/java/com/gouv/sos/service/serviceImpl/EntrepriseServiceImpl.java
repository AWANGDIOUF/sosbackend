package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Entreprise;
import com.gouv.sos.repository.IEntrepriseRepository;
import com.gouv.sos.service.IEntrepriseService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {
    private final IEntrepriseRepository entrepriseRepository;

    public EntrepriseServiceImpl(IEntrepriseRepository entrepriseRepository){
        this.entrepriseRepository=entrepriseRepository;
    }
    @Override
    public Entreprise getEntreprise(Long idEntreprise) throws ResourceNotFoundException {
        return entrepriseRepository.findById(idEntreprise).orElseThrow(()->new ResourceNotFoundException("l'entreprise n'existe pas"));
    }

    @Override
    public Entreprise updateEntreprise(Entreprise entreprise) throws ResourceNotFoundException {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise addEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void deleteEntreprise(Long idEntreprise) {
        entrepriseRepository.deleteById(idEntreprise);
    }

    @Override
    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }
}
