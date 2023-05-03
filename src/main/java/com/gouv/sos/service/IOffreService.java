package com.gouv.sos.service;

import com.gouv.sos.entities.Offre;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IOffreService {

    Offre getOffre(Long idOffre) throws ResourceNotFoundException;
    Offre updateOffre( Offre offre) throws ResourceNotFoundException;
    Offre addOffre(Offre offre);
    void deleteOffre(Long idOffre);
    List<Offre> getAllOffre();
}
