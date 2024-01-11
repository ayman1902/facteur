package ma.ac.emi.examfacteur.repositories;

import ma.ac.emi.examfacteur.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Personne,Long> {
}
