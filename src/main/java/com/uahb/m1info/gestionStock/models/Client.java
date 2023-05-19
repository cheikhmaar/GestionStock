package com.uahb.m1info.gestionStock.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uahb.m1info.gestionStock.models.Commande;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String code;

    @Column(length = 40, nullable = false)
    private String nom;

    @Column(length = 40, nullable = false)
    private String prenom;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;


}
