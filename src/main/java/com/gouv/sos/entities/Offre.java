package com.gouv.sos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "offre")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Offre implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_offre")
    private Long idOffre;

    private String nom;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;
}
