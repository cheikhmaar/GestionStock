package com.uahb.m1info.gestionStock.controller;

import com.uahb.m1info.gestionStock.dto.CommandeDto;
import com.uahb.m1info.gestionStock.models.Commande;
import com.uahb.m1info.gestionStock.repository.CommandeRepository;
import com.uahb.m1info.gestionStock.service.ServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/commande")
public class CommandeController {

    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private ServiceMapper serviceMapper;

    @GetMapping
    public List<Commande> commande(){
        return commandeRepository.findAll();
    }

    @PostMapping()
    public ResponseEntity<?> saveCommandes(@RequestBody CommandeDto commandeDto) {
        return new ResponseEntity<>(commandeRepository.save(serviceMapper.commandeDtoToCommandeEntity(commandeDto)), HttpStatus.CREATED);
    }
}
