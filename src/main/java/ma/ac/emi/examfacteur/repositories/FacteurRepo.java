package ma.ac.emi.examfacteur.repositories;

import ma.ac.emi.examfacteur.entities.Facteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacteurRepo extends JpaRepository<Facteur,Long> {
}
