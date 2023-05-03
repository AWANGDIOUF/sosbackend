package com.gouv.sos.service;

import com.gouv.sos.entities.Partenaire;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IPartenaireService {

    Partenaire getPartenaire(Long idPartenaire) throws ResourceNotFoundException;
    Partenaire updatePartenaire( Partenaire partenaire) throws ResourceNotFoundException;
    Partenaire addPartenaire(Partenaire partenaire);
    void deletePartenaire(Long idPartenaire);
    List<Partenaire> getAllPartenaire();
    List<Partenaire> getAllPartenaireEntreprise(Long idPartenaire) throws ResourceNotFoundException;
}
