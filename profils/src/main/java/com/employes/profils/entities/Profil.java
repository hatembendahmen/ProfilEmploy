package com.employes.profils.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Profil {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProfil;
    private String nom;
    private String titre;
    private int nbrAExp;
    private String competence;
    private String email;


}
