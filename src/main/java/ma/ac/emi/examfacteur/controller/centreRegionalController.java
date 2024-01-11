package ma.ac.emi.examfacteur.controller;

import ma.ac.emi.examfacteur.entities.CentreRegional;
import ma.ac.emi.examfacteur.repositories.CentreRegionalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/region")
public class centreRegionalController {
    @Autowired
    CentreRegionalRepo centreRegionalRepo;


    @GetMapping("/{id}")
    public CentreRegional getRegion(@PathVariable("id") Long regionId){
        return centreRegionalRepo.findById(regionId).get();
    }

    @GetMapping
    public List<CentreRegional> getRegionAll(){
        return centreRegionalRepo.findAll();
    }
}
