package ma.ac.emi.examfacteur.controller;

import ma.ac.emi.examfacteur.entities.CentrePostal;
import ma.ac.emi.examfacteur.repositories.CentrePostalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("postal/")
public class centrePostalController {
    @Autowired
    CentrePostalRepo centrePostalRepo;
    @GetMapping("/{id}")
    public CentrePostal getPostal(@PathVariable("id") Long postalId){
        return centrePostalRepo.findById(postalId).get();
    }

    @GetMapping
    public List<CentrePostal> getPostal(){
        return centrePostalRepo.findAll();
    }
}
