package ma.ac.emi.examfacteur.repositories;

import ma.ac.emi.examfacteur.entities.Habitant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitantRepo extends JpaRepository<Habitant,Long> {
}
