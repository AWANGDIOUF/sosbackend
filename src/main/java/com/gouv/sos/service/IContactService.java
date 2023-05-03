package com.gouv.sos.service;

import com.gouv.sos.entities.Contact;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

public interface IContactService {
    Contact getContact(Long idContact) throws ResourceNotFoundException;
    Contact updateContact( Contact contact) throws ResourceNotFoundException;
    Contact addContact(Contact contact);
    void deleteContact(Long idContact);
    List<Contact> getAllContact();
    List<Contact> getAllContactEntreprise(Long idContact) throws ResourceNotFoundException;
}
