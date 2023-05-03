package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Objectif;
import com.gouv.sos.service.serviceImpl.ObjectifServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objectiSOS")
public class ObjectifControlleur {
    @Autowired
    private ObjectifServiceImpl objectifService;

    private Objectif objectif = new Objectif();

    // Permet d'obtenir la liste des objectifs pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Objectif>> getAllObjectif(){
        List<Objectif> objectifs = objectifService.getAllObjectif();
        return ResponseEntity.ok().body(objectifs);
    }

    // Permet d'obtenir la liste des informations des objectifs d'une entreprise
    @GetMapping("/list/idObjectif")
    @ResponseBody
    public ResponseEntity<List<Objectif>> getAllObjectifEntreprise(@PathVariable(value = "idObjectif") Long idObjectif) throws ResourceNotFoundException{
        List<Objectif> objectifs = objectifService.getAllObjectifEntreprise(idObjectif);
        return ResponseEntity.ok().body(objectifs);
    }

    // Permet d'obtenir un objectif en envoyant l'identifiant
    @GetMapping("/idObjectif")
    public ResponseEntity<Objectif> getObjectif(@PathVariable(value = "idObjectif") Long idObjectif) throws ResourceNotFoundException {
        objectif = objectifService.getObjectif(idObjectif);
        return ResponseEntity.ok().body(objectif);
    }

    // Permet d'ajouter un objectif
    @PostMapping
    public ResponseEntity<Objectif> addObjectif(@RequestBody Objectif objectif){
        return ResponseEntity.ok().body(objectifService.addObjectif(objectif));
    }

    // Permet de Modifier un objectif en envoyant sont identifiant
    @PutMapping("/idObjectif")
    public  ResponseEntity<Objectif> updateObjectif(@PathVariable(value = "idObjectif") Long idObjectif, @RequestBody Objectif objectifRequest) throws ResourceNotFoundException{
        objectifRequest.setIdObjectif(idObjectif);
        return ResponseEntity.ok().body(objectifService.updateObjectif(objectifRequest));
    }

    // Permet de Supprimer un objectif en specifiant l'identifiant
    @DeleteMapping("/idObjectif")
    public String deleteContact(@PathVariable(value = "idObjectif") Long idObjectif){
        objectifService.deleteObjectif(idObjectif);
        return "ok";
    }
}
