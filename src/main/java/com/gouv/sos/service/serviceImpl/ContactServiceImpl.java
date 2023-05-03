package com.gouv.sos.service.serviceImpl;

import com.gouv.sos.entities.Contact;
import com.gouv.sos.repository.IContactRepository;
import com.gouv.sos.service.IContactService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements IContactService {

    private final IContactRepository contactRepository;

    public ContactServiceImpl(IContactRepository contactRepository){
        this.contactRepository=contactRepository;
    }

    @Override
    public Contact getContact(Long idContact) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public void deleteContact(Long idContact) {

    }

    @Override
    public List<Contact> getAllContact() {
        return null;
    }
}
