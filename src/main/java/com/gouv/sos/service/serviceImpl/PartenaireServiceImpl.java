package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Partenaire;
import com.gouv.sos.service.IPartenaireService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireServiceImpl implements IPartenaireService {
    @Override
    public Partenaire getPartenaire(Long idPartenaire) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Partenaire updatePartenaire(Partenaire partenaire) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Partenaire addPartenaire(Partenaire partenaire) {
        return null;
    }

    @Override
    public void deletePartenaire(Long idPartenaire) {

    }

    @Override
    public List<Partenaire> getAllPartenaire() {
        return null;
    }
}
