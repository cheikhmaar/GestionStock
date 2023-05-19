package com.uahb.m1info.gestionStock.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class DetailDto {

    private String nomPro;
    private float prix;
    private float quantite;
    private float sous_total;

}
