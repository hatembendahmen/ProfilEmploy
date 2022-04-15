package com.employes.profils.repository;

import com.employes.profils.entities.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil, Long> {
}
