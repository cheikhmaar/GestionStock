package com.uahb.m1info.gestionStock.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CommandeDto {

    private Date date;
    private String adresse;
    private float total;
    private Long idCliend;
    private String codeClient;
    private String nomClient;
    private String prenomClient;
    private List<DetailDto> detailDtos;


}
