package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Contact;
import com.gouv.sos.entities.Partenaire;
import com.gouv.sos.service.serviceImpl.ContactServiceImpl;
import com.gouv.sos.service.serviceImpl.PartenaireServiceImpl;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partenaireSOS")
public class PartenaireControlleur {
    @Autowired
    private PartenaireServiceImpl partenaireService;

    private Partenaire partenaire = new Partenaire();

    // Permet d'obtenir la liste des partenaires pour admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Partenaire>> getAllPartenaire(){
        List<Partenaire> partenaires = partenaireService.getAllPartenaire();
        return ResponseEntity.ok().body(partenaires);
    }

    // Permet d'obtenir la liste des informations des partenaires pour une entreprise
    @GetMapping("/list/idPartenaire")
    @ResponseBody
    public ResponseEntity<List<Partenaire>> getAllPartenaireEntreprise(@PathVariable(value = "idPartenaire") Long idPartenaire) throws ResourceNotFoundException{
        List<Partenaire> partenaires = partenaireService.getAllPartenaireEntreprise(idPartenaire);
        return ResponseEntity.ok().body(partenaires);
    }

    // Permet d'obtenir un partenaire en envoyant l'identifiant
    @GetMapping("/idPartenaire")
    public ResponseEntity<Partenaire> getPartenaire(@PathVariable(value = "idPartenaire") Long idPartenaire) throws ResourceNotFoundException {
        partenaire = partenaireService.getPartenaire(idPartenaire);
        return ResponseEntity.ok().body(partenaire);
    }

    // Permet d'ajouter un partenaire
    @PostMapping
    public ResponseEntity<Partenaire> addPartenaire(@RequestBody Partenaire partenaire){
        return ResponseEntity.ok().body(partenaireService.addPartenaire(partenaire));
    }

    // Permet de Modifier un partenaire en envoyant sont identifiant
    @PutMapping("/idPartenaire")
    public  ResponseEntity<Partenaire> updatePartenaire(@PathVariable(value = "idPartenaire") Long idPartenaire, @RequestBody Partenaire partenaireRequest){
        partenaireRequest.setIdPartenaire(idPartenaire);
        return ResponseEntity.ok().body(partenaireService.updatePartenaire(partenaireRequest));
    }

    // Permet de Supprimer un partenaire en specifiant l'identifiant
    @DeleteMapping("/idPartenaire")
    public String deleteContact(@PathVariable(value = "idPartenaire") Long idPartenaire){
        partenaireService.deletePartenaire(idPartenaire);
        return "ok";
    }
}
