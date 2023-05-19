package com.uahb.m1info.gestionStock.repository;

import com.uahb.m1info.gestionStock.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository <Produit,Long> {

    Produit findByNom(String nom);
}

