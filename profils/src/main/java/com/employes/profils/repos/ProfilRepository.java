package com.employes.profils.repos;

import com.employes.profils.entities.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil, Long> {
}
