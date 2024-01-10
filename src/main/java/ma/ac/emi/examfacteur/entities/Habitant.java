package ma.ac.emi.examfacteur.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Habitant extends Personne{
    private String email;
    private String telephone;
    @OneToMany(mappedBy = "habitant_emetteur")
    private List<Colis> colis_emetteur;
    @OneToMany(mappedBy = "habitant_destinataire")
    private List<Colis> colis_recepteur;
    @ManyToOne
    private CentrePostal centrePostal;

    public Habitant(String nom, String prenom, String rue, String quartier, String ville, String email, String telephone) {
        super(nom, prenom, rue, quartier, ville);
        this.email = email;
        this.telephone = telephone;
    }


    public Habitant() {

    }

    public List<Colis> getColis_emetteur() {
        return colis_emetteur;
    }

    public void setColis_emetteur(List<Colis> colis_emetteur) {
        this.colis_emetteur = colis_emetteur;
    }

    public List<Colis> getColis_recepteur() {
        return colis_recepteur;
    }

    public void setColis_recepteur(List<Colis> colis_recepteur) {
        this.colis_recepteur = colis_recepteur;
    }

    public CentrePostal getCentrePostal() {
        return centrePostal;
    }

    public void setCentrePostal(CentrePostal centrePostal) {
        this.centrePostal = centrePostal;
    }

    public Habitant(String email, String telephone) {
        this.email = email;
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitant habitant = (Habitant) o;
        return Objects.equals(email, habitant.email) && Objects.equals(telephone, habitant.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, telephone);
    }

    @Override
    public String toString() {
        return "Habitant{" +
                "email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", colis_emetteur=" + colis_emetteur +
                ", colis_recepteur=" + colis_recepteur +
                ", centrePostal=" + centrePostal +
                '}';
    }
}
