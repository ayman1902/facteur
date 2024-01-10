package ma.ac.emi.examfacteur.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Facteur extends Personne{

    @OneToMany(mappedBy = "facteur")
    private List<Colis> colis;
    @ManyToOne
    @JoinColumn
    private CentrePostal centrePostal;
    public Facteur(String nom, String prenom, String rue, String quartier, String ville) {
        super(nom, prenom, rue, quartier, ville);
    }

    public Facteur() {
    }

    public List<Colis> getColis() {
        return colis;
    }

    public void setColis(List<Colis> colis) {
        this.colis = colis;
    }

    public CentrePostal getCentrePostal() {
        return centrePostal;
    }

    public void setCentrePostal(CentrePostal centrePostal) {
        this.centrePostal = centrePostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facteur facteur = (Facteur) o;
        return Objects.equals(colis, facteur.colis) && Objects.equals(centrePostal, facteur.centrePostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colis, centrePostal);
    }

    @Override
    public String toString() {
        return "Facteur{" +
                "colis=" + colis +
                ", centrePostal=" + centrePostal +
                '}';
    }
}
