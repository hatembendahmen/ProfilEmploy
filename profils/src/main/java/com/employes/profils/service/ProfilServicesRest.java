package com.employes.profils.service;

import com.employes.profils.entities.Profil;
import com.employes.profils.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfilServicesRest {
    @Autowired
    private ProfilRepository profilRepository;
    @GetMapping(value = "/listProfils")
    public List<Profil> listProfils(){
        return profilRepository.findAll();
    }
    @GetMapping(value = "/listProfils/{id}")
    public Profil listProfils(@PathVariable(name = "id") Long id){
        return profilRepository.findById(id).get();
    }
    @PutMapping(value = "/listProfils/{id}")
    public Profil update(@PathVariable(name = "id") Long id, @RequestBody Profil p){
        p.setIdProfil(id);
        return profilRepository.save(p);
    }

    @PostMapping(value = "/listProfils")
    public Profil save(@RequestBody Profil p){
        return profilRepository.save(p);
    }
    @DeleteMapping(value = "/listProfils/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        profilRepository.deleteById(id);
    }
}
