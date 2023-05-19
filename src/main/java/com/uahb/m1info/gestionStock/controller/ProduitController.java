package com.uahb.m1info.gestionStock.controller;

import com.uahb.m1info.gestionStock.models.Produit;
import com.uahb.m1info.gestionStock.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/produit"})
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> index(){
        return produitRepository.findAll();
    }

    @PostMapping
    public Produit save(@RequestBody Produit produit){
        //produit.setProduit(produitRepository.findById(produit.getProduit().getId()).get());
        return produitRepository.save(produit);
    }
}
