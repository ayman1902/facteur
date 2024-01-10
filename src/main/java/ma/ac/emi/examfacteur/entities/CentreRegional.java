package ma.ac.emi.examfacteur.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CentreRegional extends CentrePostal{

    @OneToMany(mappedBy = "centreRegional")
    private List<CentrePostal> centrePostals;

    public CentreRegional(String nom, int numero, String rue, String quartier, String ville) {
        super(nom, numero, rue, quartier, ville);
    }

    public CentreRegional() {
    }

    public List<CentrePostal> getCentrePostals() {
        return centrePostals;
    }

    public void setCentrePostals(List<CentrePostal> centrePostals) {
        this.centrePostals = centrePostals;
    }
}
