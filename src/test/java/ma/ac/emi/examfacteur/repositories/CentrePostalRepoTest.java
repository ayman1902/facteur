package ma.ac.emi.examfacteur.repositories;

import ma.ac.emi.examfacteur.entities.CentrePostal;
import ma.ac.emi.examfacteur.entities.CentreRegional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CentrePostalRepoTest {
    @Autowired
    CentrePostalRepo centrePostalRepo;
    @Autowired
    CentreRegionalRepo centreRegionalRepo;

    @Test
    public void addCentrePostal(){
        CentrePostal centrePostal = new CentrePostal("PosteAmal1",4000,"CYM","J5","Rabat");
        centrePostal.setCentreRegional(centreRegionalRepo.findById(1L).get());
        centrePostalRepo.save(centrePostal);
    }
    @Test
    public void findAllPostal(){
        List<CentrePostal> centrePostals = centrePostalRepo.findAll();
        System.out.println(centrePostals);
    }



}