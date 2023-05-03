package com.gouv.sos.repository;

import com.gouv.sos.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContactRepository extends JpaRepository<Contact, Long> {
    @Query(value = "select contact from Contact contact where contact.entreprise.idEntreprise =:idEntreprise")
    List<Contact> AllContacts(@Param("idEntreprise") Long idEntreprise);

}
