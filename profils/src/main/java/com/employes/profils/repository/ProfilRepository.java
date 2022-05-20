package com.employes.profils.repository;

import com.employes.profils.entities.Profil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ProfilRepository extends JpaRepository<Profil,Long> {

    @RestResource(path = "/byNom")
    public List<Profil> findByNomContains(@Param("mc") String n);

    @RestResource(path = "/byNomPage")
    public Page<Profil> findByNomContains(@Param("mc") String n, Pageable pageable);

}

