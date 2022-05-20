package com.employes.profils;

import com.employes.profils.entities.Profil;
import com.employes.profils.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProfilsApplication implements CommandLineRunner {
    @Autowired
    private ProfilRepository profilRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ProfilsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Profil.class);
        profilRepository.save(new Profil(null,"Ben dahmen Hatem","Ingénieur",5,"java, spring, angular","hatembendahmen@gmail.com"));
        profilRepository.save(new Profil(null,"Chaabi Riadh","Ingénieur",11,"Linux, Windows","riadhchaabi@gmail.com"));
        profilRepository.save(new Profil(null,"khaled Ahmed","Technicien",9,"cisco, virtualisation","khaledahmed@gmail.com"));

        profilRepository.findAll().forEach(profil -> {
            System.out.println(profil.toString());
        });
    }
}
