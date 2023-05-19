package com.uahb.m1info.gestionStock.repository;

import com.uahb.m1info.gestionStock.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client,Long> {
}
