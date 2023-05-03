package com.gouv.sos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "Partenaire")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Partenaire implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partenaire")
    private Long idPartenaire;

    private String nom;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private Entreprise entreprise;
}
