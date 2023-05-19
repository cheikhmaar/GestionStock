package com.uahb.m1info.gestionStock.service;

import com.uahb.m1info.gestionStock.dto.CommandeDto;
import com.uahb.m1info.gestionStock.models.Client;
import com.uahb.m1info.gestionStock.models.Commande;
import com.uahb.m1info.gestionStock.models.Detail;
import com.uahb.m1info.gestionStock.models.Produit;
import com.uahb.m1info.gestionStock.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceMapper {

    @Autowired
    ProduitRepository produitRepository;

    public Client clientDtoToClientEntity(CommandeDto commandeDto){
        return new Client(commandeDto.getIdCliend(),commandeDto.getCodeClient(),commandeDto.getNomClient(),commandeDto.getPrenomClient(),null);
    }

    public Commande commandeDtoToCommandeEntity(CommandeDto commandeDto){
        List<Detail> detail = commandeDto.getDetailDtos().stream().map(detailDto -> {
            Produit produit = produitRepository.findByNom(detailDto.getNomPro());
            return new Detail(null, null, produit, detailDto.getPrix(),detailDto.getQuantite(),detailDto.getSous_total());
        }).toList();

        Commande cmd = new Commande(null, commandeDto.getDate(), commandeDto.getAdresse(),commandeDto.getTotal(),detail,clientDtoToClientEntity(commandeDto));
        cmd.setDetail(detail.stream().map(detailEntity -> {
            detailEntity.setCommande(cmd);
            return detailEntity;
        }).toList());
        return cmd;
    }

}
