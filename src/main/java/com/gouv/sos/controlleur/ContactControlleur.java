package com.gouv.sos.controlleur;

import com.gouv.sos.entities.Contact;
import com.gouv.sos.service.serviceImpl.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactSOS")
public class ContactControlleur {

    @Autowired
    private ContactServiceImpl contactService;

    private Contact contact = new Contact();

    // Permet d'obtenir la liste des contacts pour l'admin
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Contact>>getAllContact(){
        List<Contact> contacts = contactService.getAllContact();
        return ResponseEntity.ok().body(contacts);
    }

    // Permet d'obtenir la liste des informations de contact pour un entreprise
    @GetMapping("/list/idContact")
    @ResponseBody
    public ResponseEntity<List<Contact>>getAllContactEntreprise(@PathVariable(value = "idContact") Long idContact) throws ResourceNotFoundException{
        List<Contact> contacts = contactService.getAllContactEntreprise(idContact);
        return ResponseEntity.ok().body(contacts);
    }

    // Permet d'obtenir un contact en envoyant l'identifiant
    @GetMapping("/idContact")
    public ResponseEntity<Contact> getContact(@PathVariable(value = "idContact") Long idContact) throws ResourceNotFoundException{
        contact = contactService.getContact(idContact);
        return ResponseEntity.ok().body(contact);
    }

    // Permet d'ajouter une contact
    @PostMapping
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
        return ResponseEntity.ok().body(contactService.addContact(contact));
    }

    // Permet de Modifier un contact en envoyant sont identifiant
    @PutMapping("/idContact")
    public  ResponseEntity<Contact> updateContact(@PathVariable(value = "idContact") Long idContact, @RequestBody Contact contactRequest) throws ResourceNotFoundException{
        contactRequest.setIdContact(idContact);
        return ResponseEntity.ok().body(contactService.updateContact(contactRequest));
    }

    // Permet de Supprimer un contact en specifiant l'identifiant
    @DeleteMapping("/idContact")
    public String deleteContact(@PathVariable(value = "idContact") Long idContact){
        contactService.deleteContact(idContact);
        return "ok";
    }
}
