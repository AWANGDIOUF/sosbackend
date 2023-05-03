package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Evenement;
import com.gouv.sos.repository.IEvenementRepository;
import com.gouv.sos.service.IEvenementService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementServiceImpl implements IEvenementService {

    private final IEvenementRepository evenementRepository;

    public EvenementServiceImpl(IEvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    @Override
    public Evenement getEvenement(Long idEvenement) throws ResourceNotFoundException {
        return evenementRepository.findById(idEvenement).orElseThrow(()->new ResourceNotFoundException("Cette Evenement n'existe pas"));
    }

    @Override
    public Evenement updateEvenement(Evenement evenement) throws ResourceNotFoundException {
        return evenementRepository.save(evenement);
    }

    @Override
    public Evenement addEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public void deleteEvenement(Long idEvenement) {
        evenementRepository.deleteById(idEvenement);
    }

    @Override
    public List<Evenement> getAllEvenement() {
        return evenementRepository.findAll();
    }

    @Override
    public List<Evenement> getAllEvenementEntreprise(Long idEvenement) throws ResourceNotFoundException {
        return evenementRepository.AllEntreprises(idEvenement);
    }

}
