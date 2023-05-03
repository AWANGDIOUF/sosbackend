package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Partenaire;
import com.gouv.sos.repository.IPartenaireRepository;
import com.gouv.sos.service.IPartenaireService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireServiceImpl implements IPartenaireService {

    private final IPartenaireRepository partenaireRepository;

    public PartenaireServiceImpl(IPartenaireRepository partenaireRepository) {
        this.partenaireRepository = partenaireRepository;
    }

    @Override
    public Partenaire getPartenaire(Long idPartenaire) throws ResourceNotFoundException {
        return partenaireRepository.findById(idPartenaire).orElseThrow(()->new ResourceNotFoundException("Cette Partenaire n'existe pas"));
    }

    @Override
    public Partenaire updatePartenaire(Partenaire partenaire) throws ResourceNotFoundException {
        return partenaireRepository.save(partenaire);
    }

    @Override
    public Partenaire addPartenaire(Partenaire partenaire) {
        return partenaireRepository.save(partenaire);
    }

    @Override
    public void deletePartenaire(Long idPartenaire) {
        partenaireRepository.deleteById(idPartenaire);
    }

    @Override
    public List<Partenaire> getAllPartenaire() {
        return partenaireRepository.findAll();
    }

    @Override
    public List<Partenaire> getAllPartenaireEntreprise(Long idPartenaire) throws ResourceNotFoundException {
        return partenaireRepository.AllPartenaires(idPartenaire);
    }

}
