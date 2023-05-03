package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Equipe;
import com.gouv.sos.repository.IEquipeRepository;
import com.gouv.sos.service.IEquipeService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements IEquipeService {

    private final IEquipeRepository equipeRepository;

    public EquipeServiceImpl(IEquipeRepository equipeRepository){
        this.equipeRepository=equipeRepository;
    }
    @Override
    public Equipe getEquipe(Long idEquipe) throws ResourceNotFoundException {
        return equipeRepository.findById(idEquipe).orElseThrow(()->new ResourceNotFoundException("Cette equipe n'existe pas"));
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) throws ResourceNotFoundException {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(Long idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }

    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public List<Equipe> getAllEquipeEntreprise(Long idEquipe) throws ResourceNotFoundException {
        return equipeRepository.AllEquipes(idEquipe);
    }


}
