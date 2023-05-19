package com.uahb.m1info.gestionStock.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail implements Serializable {

    @EmbeddedId
    private CommandeProduitId id;

    @JsonIgnore
    @ManyToOne
    @MapsId("commande_Id")
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @MapsId("produit_Id")
    @JoinColumn(name = "produit_id")
    protected Produit produit;

    private float prix;

    private float quantite;

    private float sous_total;

}
