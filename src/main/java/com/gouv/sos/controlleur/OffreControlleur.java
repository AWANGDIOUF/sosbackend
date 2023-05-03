package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Offre;
import com.gouv.sos.service.serviceImpl.OffreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offreSOS")
public class OffreControlleur {
    @Autowired
    private OffreServiceImpl offreService;

    private Offre offre = new Offre();

    // Permet d'obtenir la liste des offres pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Offre>> getAllOffre(){
        List<Offre> offres = offreService.getAllOffre();
        return ResponseEntity.ok().body(offres);
    }

    // Permet d'obtenir la liste des informations des offres pour une entreprise
    @GetMapping("/list/idOffre")
    @ResponseBody
    public ResponseEntity<List<Offre>> getAllOffreEntreprise(@PathVariable(value = "idOffre") Long idOffre) throws ResourceNotFoundException{
        List<Offre> offres = offreService.getAllOffreEntreprise(idOffre);
        return ResponseEntity.ok().body(offres);
    }

    // Permet d'obtenir une offre en envoyant l'identifiant
    @GetMapping("/idOffre")
    public ResponseEntity<Offre> getOffre(@PathVariable(value = "idOffre") Long idOffre) throws ResourceNotFoundException {
        offre = offreService.getOffre(idOffre);
        return ResponseEntity.ok().body(offre);
    }

    // Permet d'ajouter une offre
    @PostMapping
    public ResponseEntity<Offre> addOffre(@RequestBody Offre offre){
        return ResponseEntity.ok().body(offreService.addOffre(offre));
    }

    // Permet de Modifier une offre en envoyant sont identifiant
    @PutMapping("/idOffre")
    public  ResponseEntity<Offre> updateOffre(@PathVariable(value = "idOffre") Long idOffre, @RequestBody Offre offreRequest) throws ResourceNotFoundException{
        offreRequest.setIdOffre(idOffre);
        return ResponseEntity.ok().body(offreService.updateOffre(offreRequest));
    }

    // Permet de Supprimer une offre en specifiant l'identifiant
    @DeleteMapping("/idOffre")
    public String deleteContact(@PathVariable(value = "idOffre") Long idOffre){
        offreService.deleteOffre(idOffre);
        return "ok";
    }
}
