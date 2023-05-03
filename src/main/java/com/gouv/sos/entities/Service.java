package com.gouv.sos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "Service")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Service implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private Long idService;

    private String nom;

    private String description;

    @OneToMany(mappedBy = "service")
    private Collection<Offre> offres;
    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private Entreprise entreprise;
}
