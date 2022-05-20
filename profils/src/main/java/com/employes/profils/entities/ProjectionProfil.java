package com.employes.profils.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "pj1", types = Profil.class)
public interface ProjectionProfil {
    public String getNom();
}
