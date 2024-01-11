package ma.ac.emi.examfacteur;

import ma.ac.emi.examfacteur.entities.*;
import ma.ac.emi.examfacteur.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ExamFacteurApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamFacteurApplication.class, args);
    }
    @Autowired
    PersonneRepo personneRepo;

    @Autowired
    ColisRepo colisRepo;

    @Autowired
    CentreLocalRepo centreLocalRepo;

    @Autowired
    CentrePostalRepo centrePostalRepo;

    @Autowired
    CentreRegionalRepo centreRegionalRepo;

    @Autowired
    HabitantRepo habitantRepo;
    @Autowired
    FacteurRepo facteurRepo;
    @Bean
    CommandLineRunner coucou(){
        return args -> {
            /*Personne personne = new Personne("Ayman","Belhaj","CYM","J5","Rabat");
            personneRepo.save(personne);

            CentreRegional centreRegional = new CentreRegional("PosteAmal1",4000,"CYM","J5","Rabat");
            centreRegionalRepo.save(centreRegional);

            CentrePostal centrePostal1 =new CentrePostal("PosteJ5",4000,"CYM","J5","Rabat");
            centrePostal1.setCentreRegional(centreRegional);

            centrePostalRepo.save(centrePostal1);*/
/*

            CentreLocal centreLocal = new CentreLocal("lmopa",369,"J5","CYM","RABAT");
            centreLocalRepo.save(centreLocal);

            Habitant habitant1 = new Habitant("Belhaj","Ayman","CYM","J5","RABAT","belhaj.ayman@gmail.com","0611727669");
            habitantRepo.save(habitant1);
            Habitant habitant2 = new Habitant("Zahraoui","Issam","tem","tem","TEMARA","ZAG.ISS@gmail.com","0611727669");
            habitantRepo.save(habitant2);

            Facteur facteur1 = new Facteur("Bentayfor","Yassine","L9WASS","CYM","Rabat");
            facteurRepo.save(facteur1);



            CentrePostal centrePostal1 =new CentrePostal("PosteJ5",4000,"CYM","J5","Rabat");

            //adding regional list
            CentreRegional centreRegional = new CentreRegional("agdal",890,"agdal","agdal","Rabat");
            centreRegionalRepo.save(centreRegional);

            List centreRegionals = new ArrayList<>();
            centreRegionals.add(centreRegionals);

            centrePostal1.setCentreRegional(centreRegional);
            centrePostalRepo.save(centrePostal1);

            Colis colis = new Colis(567L,new Date(),new Date());
            colis.setFacteur(facteur1);
            colis.setHabitant_destinataire(habitant1);
            colis.setHabitant_emetteur(habitant2);

            List colslist = new ArrayList<>();
            colslist.add(colis);


            colis.setCentrePostals(colslist);
            colisRepo.save(colis);
*/







        };
    }

}
