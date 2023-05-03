package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Offre;
import com.gouv.sos.service.IOffreService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreServiceImpl implements IOffreService {
    @Override
    public Offre getOffre(Long idOffre) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Offre updateOffre(Offre offre) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Offre addOffre(Offre offre) {
        return null;
    }

    @Override
    public void deleteOffre(Long idOffre) {

    }

    @Override
    public List<Offre> getAllOffre() {
        return null;
    }
}
