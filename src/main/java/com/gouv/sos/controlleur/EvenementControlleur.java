package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Evenement;
import com.gouv.sos.service.serviceImpl.EvenementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evenementSOS")
public class EvenementControlleur {
    @Autowired
    private EvenementServiceImpl evenementService;

    private Evenement evenement = new Evenement();

    // Permet d'obtenir la liste des evenement pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Evenement>> getAllEvenement(){
        List<Evenement> evenements = evenementService.getAllEvenement();
        return ResponseEntity.ok().body(evenements);
    }

    // Permet d'obtenir la liste des evenement pour l'admin
    @GetMapping("/list/idEvenement")
    @ResponseBody
    public ResponseEntity<List<Evenement>> getAllEvenementEntreprise(@PathVariable(value = "idEvenement") Long idEvenement) throws ResourceNotFoundException{
        List<Evenement> evenements = evenementService.getAllEvenementEntreprise(idEvenement);
        return ResponseEntity.ok().body(evenements);
    }

    // Permet d'obtenir un evenement en envoyant l'identifiant
    @GetMapping("/idEvenement")
    public ResponseEntity<Evenement> getEvenement(@PathVariable(value = "idEvenement") Long idEvenement) throws ResourceNotFoundException {
        evenement = evenementService.getEvenement(idEvenement);
        return ResponseEntity.ok().body(evenement);
    }

    // Permet d'ajouter un evenement
    @PostMapping
    public ResponseEntity<Evenement> addEvenement(@RequestBody Evenement evenement){
        return ResponseEntity.ok().body(evenementService.addEvenement(evenement));
    }

    // Permet de Modifier un evenement en envoyant sont identifiant
    @PutMapping("/idEvenement")
    public  ResponseEntity<Evenement> updateEvenement(@PathVariable(value = "idEvenement") Long idEvenement, @RequestBody Evenement evenementRequest) throws ResourceNotFoundException{
        evenementRequest.setIdEvenement(idEvenement);
        return ResponseEntity.ok().body(evenementService.updateEvenement(evenementRequest));
    }

    // Permet de Supprimer un evenement en specifiant l'identifiant
    @DeleteMapping("/idEvenement")
    public String deleteContact(@PathVariable(value = "idEvenement") Long idEvenement){
        evenementService.deleteEvenement(idEvenement);
        return "ok";
    }
}
