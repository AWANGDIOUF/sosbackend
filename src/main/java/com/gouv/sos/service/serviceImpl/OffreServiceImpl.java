package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Offre;
import com.gouv.sos.repository.IOffreRepository;
import com.gouv.sos.service.IOffreService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreServiceImpl implements IOffreService {

    private final IOffreRepository offreRepository;

    public OffreServiceImpl(IOffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    @Override
    public Offre getOffre(Long idOffre) throws ResourceNotFoundException {
        return offreRepository.findById(idOffre).orElseThrow(()->new ResourceNotFoundException("Cette Offre n'existe pas"));
    }

    @Override
    public Offre updateOffre(Offre offre) throws ResourceNotFoundException {
        return offreRepository.save(offre);
    }

    @Override
    public Offre addOffre(Offre offre) {
        return offreRepository.save(offre);
    }

    @Override
    public void deleteOffre(Long idOffre) {
        offreRepository.deleteById(idOffre);
    }

    @Override
    public List<Offre> getAllOffre() {
        return offreRepository.findAll();
    }

    @Override
    public List<Offre> getAllOffreEntreprise(Long idOffre) throws ResourceNotFoundException {
        return offreRepository.AllOffres(idOffre);
    }
}
