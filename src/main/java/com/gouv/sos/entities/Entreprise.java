package com.gouv.sos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Entreprise")
public class Entreprise implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entreprise")
    private Long idEntreprise;

    private String nom;

    private String Localite;

    private byte[] logo;

    private String presentation;

    @OneToMany(mappedBy = "entreprise")
    private Collection<Objectif> ojectifs;

    @OneToMany(mappedBy = "entreprise")
    private Collection<Contact> contacts;

    @OneToMany(mappedBy = "entreprise")
    private Collection<Equipe> equipes;

    @OneToMany(mappedBy = "entreprise")
    private Collection<Evenement> evenements;

    @OneToMany(mappedBy = "entreprise")
    private Collection<Service> services;

    @OneToMany(mappedBy = "entreprise")
    private Collection<Partenaire> partenaires;
}
