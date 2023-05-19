package com.uahb.m1info.gestionStock.repository;

import com.uahb.m1info.gestionStock.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository <Commande, Long> {
}
