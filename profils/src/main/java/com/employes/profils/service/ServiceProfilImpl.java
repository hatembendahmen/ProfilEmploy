package com.employes.profils.service;

import com.employes.profils.entities.Profil;
import com.employes.profils.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProfilImpl implements ServiceProfil {

    @Autowired
    ProfilRepository profilRepository;
    @Override
    public Profil saveProfil(Profil p) {
        return profilRepository.save(p);
    }

    @Override
    public Profil updateProfil(Profil p) {
        return profilRepository.save(p);
    }

    @Override
    public void deleteProfil(Profil p) {
        profilRepository.delete(p);
    }

    @Override
    public void deleteProfilById(Long id) {
        profilRepository.deleteById(id);

    }

    @Override
    public Profil getProfil(Long id) {
        return profilRepository.findById(id).get();
    }

    @Override
    public List<Profil> getAllProfils() {
        return profilRepository.findAll();
    }
}
