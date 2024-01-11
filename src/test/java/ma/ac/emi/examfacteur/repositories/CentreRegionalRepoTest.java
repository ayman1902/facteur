package ma.ac.emi.examfacteur.repositories;

import ma.ac.emi.examfacteur.entities.CentrePostal;
import ma.ac.emi.examfacteur.entities.CentreRegional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
class CentreRegionalRepoTest {
    @Autowired
    CentreRegionalRepo centreRegionalRepo;
    @Autowired
    CentrePostalRepo centrePostalRepo;

    @Test
    public void saveCentreRegional(){
        CentreRegional centreRegional = new CentreRegional("REEEEEG",4000,"AAA","AAA","CASA");
        centreRegionalRepo.save(centreRegional);

    }

    @Test
    public void findAllReg(){
        List<CentreRegional> centreRegional = centreRegionalRepo.findAll();
        System.out.println(centreRegional);
    }

}