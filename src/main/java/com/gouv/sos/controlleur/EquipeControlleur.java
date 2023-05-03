package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Equipe;
import com.gouv.sos.service.serviceImpl.EquipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipeSOS")
public class EquipeControlleur {
    @Autowired
    private EquipeServiceImpl equipeService;

    private Equipe equipe = new Equipe();

    // Permet d'obtenir la liste des equipes pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Equipe>> getAllEquipe(){
        List<Equipe> equipes = equipeService.getAllEquipe();
        return ResponseEntity.ok().body(equipes);
    }

    // Permet d'obtenir la liste des informations des equipes d'une entreprise
    @GetMapping("/list/idEquipe")
    @ResponseBody
    public ResponseEntity<List<Equipe>> getAllEquipeEntreprise(@PathVariable(value = "idEquipe") Long idEquipe) throws ResourceNotFoundException{
        List<Equipe> equipes = equipeService.getAllEquipeEntreprise(idEquipe);
        return ResponseEntity.ok().body(equipes);
    }

    // Permet d'obtenir une equipe en envoyant l'identifiant
    @GetMapping("/idEquipe")
    public ResponseEntity<Equipe> getEquipe(@PathVariable(value = "idEquipe") Long idEquipe) throws ResourceNotFoundException {
        equipe = equipeService.getEquipe(idEquipe);
        return ResponseEntity.ok().body(equipe);
    }

    // Permet d'ajouter une equipe
    @PostMapping
    public ResponseEntity<Equipe> addContact(@RequestBody Equipe equipe){
        return ResponseEntity.ok().body(equipeService.addEquipe(equipe));
    }

    // Permet de Modifier une equipe en envoyant sont identifiant
    @PutMapping("/idEquipe")
    public  ResponseEntity<Equipe> updateEquipe(@PathVariable(value = "idEquipe") Long idEquipe, @RequestBody Equipe equipeRequest) throws ResourceNotFoundException{
        equipeRequest.setIdEquipe(idEquipe);
        return ResponseEntity.ok().body(equipeService.updateEquipe(equipeRequest));
    }

    // Permet de Supprimer une entreprise en specifiant l'identifiant
    @DeleteMapping("/idEquipe")
    public String deleteContact(@PathVariable(value = "idEquipe") Long idEquipe){
        equipeService.deleteEquipe(idEquipe);
        return "ok";
    }
}
