package com.employes.profils;

import com.employes.profils.entities.Profil;
import com.employes.profils.repository.ProfilRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;


@SpringBootTest
class ProfilsApplicationTests {

    @Autowired
    private ProfilRepository profilRepository;
    @Test
    public void testCreateProfil() {
        Profil prof = new Profil(null,"hatem ben dahmen","Ingenieur",5,"java,springboot,angular","hatembendahmen@gmail.com");
        profilRepository.save(prof);
    }
    @Test
    public void testFindProfil()
    {
     Profil p = profilRepository.findById(1L).get();
     System.out.println(p);
    }

}
