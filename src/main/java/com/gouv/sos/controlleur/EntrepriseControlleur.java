package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Entreprise;
import com.gouv.sos.service.serviceImpl.EntrepriseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrepriseSOS")
public class EntrepriseControlleur {
    @Autowired
    private EntrepriseServiceImpl entrepriseService;

    private Entreprise entreprise = new Entreprise();

    // Permet d'obtenir la liste des entreprises pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Entreprise>> getAllEntreprise(){
        List<Entreprise> entreprises = entrepriseService.getAllEntreprise();
        return ResponseEntity.ok().body(entreprises);
    }

    // Permet d'obtenir une entreprise en envoyant l'identifiant
    @GetMapping("/idEntreprise")
    public ResponseEntity<Entreprise> getEntreprise(@PathVariable(value = "idEntreprise") Long idEntreprise) throws ResourceNotFoundException {
        entreprise = entrepriseService.getEntreprise(idEntreprise);
        return ResponseEntity.ok().body(entreprise);
    }

    // Permet d'ajouter une entreprise
    @PostMapping
    public ResponseEntity<Entreprise> addEntreprise(@RequestBody Entreprise entreprise){
        return ResponseEntity.ok().body(entrepriseService.addEntreprise(entreprise));
    }

    // Permet de Modifier une entreprise en envoyant sont identifiant
    @PutMapping("/idEntreprise")
    public  ResponseEntity<Entreprise> updateEntreprise(@PathVariable(value = "idEntreprise") Long idEntreprise, @RequestBody Entreprise entrepriseRequest) throws ResourceNotFoundException{
        entrepriseRequest.setIdEntreprise(idEntreprise);
        return ResponseEntity.ok().body(entrepriseService.updateEntreprise(entrepriseRequest));
    }

    // Permet de Supprimer une entreprise en specifiant l'identifiant
    @DeleteMapping("/idEntreprise")
    public String deleteEntreprise(@PathVariable(value = "idEntreprise") Long idEntreprise){
        entrepriseService.deleteEntreprise(idEntreprise);
        return "ok";
    }
}
