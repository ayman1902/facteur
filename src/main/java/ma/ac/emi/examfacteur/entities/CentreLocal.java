package ma.ac.emi.examfacteur.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "local")
public class CentreLocal extends CentrePostal{
    public CentreLocal(String nom, int numero, String rue, String quartier, String ville) {
        super(nom, numero, rue, quartier, ville);
    }

    public CentreLocal() {
    }

    @Override
    public String toString() {
        return "CentreLocal{}";
    }
}
