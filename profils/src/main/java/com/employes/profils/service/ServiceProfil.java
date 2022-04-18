package com.employes.profils.service;

import com.employes.profils.entities.Profil;

import java.util.List;

public interface ServiceProfil {

    Profil saveProfil(Profil p);
    Profil updateProfil(Profil p);
    void deleteProfil(Profil p);
    void deleteProfilById(Long id);
    Profil getProfil(Long id);
    List<Profil> getAllProfils();
}
