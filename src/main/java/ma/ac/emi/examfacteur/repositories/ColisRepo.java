package ma.ac.emi.examfacteur.repositories;

import ma.ac.emi.examfacteur.entities.Colis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColisRepo extends JpaRepository<Colis,Long> {
}
