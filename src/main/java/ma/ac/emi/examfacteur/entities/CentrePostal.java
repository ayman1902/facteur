package ma.ac.emi.examfacteur.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CentreType", discriminatorType= DiscriminatorType.STRING, length=20)

public class CentrePostal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long centrePostalId;
    private String nom;
    private int numero;
    private String rue;
    private String quartier;
    private String ville;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "centreRegional")
    @JsonIgnore
    private CentreRegional centreRegional;



    @OneToMany(mappedBy = "centrePostal")
    private List<Facteur> facteurs;
    @OneToMany(mappedBy = "centrePostal")
    private List<Habitant> habitants;

    @ManyToMany(mappedBy = "centrePostals")
    private List<Colis> colis;













    public CentrePostal(String nom, int numero, String rue, String quartier, String ville) {
        this.nom = nom;
        this.numero = numero;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
    }

    public CentrePostal() {
    }

    public Long getCentrePostalId() {
        return centrePostalId;
    }

    public void setCentrePostalId(Long centrePostalId) {
        this.centrePostalId = centrePostalId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public CentreRegional getCentreRegional() {
        return centreRegional;
    }

    public void setCentreRegional(CentreRegional centreRegional) {
        this.centreRegional = centreRegional;
    }

    public List<Colis> getColis() {
        return colis;
    }

    public void setColis(List<Colis> colis) {
        this.colis = colis;
    }

    public List<Facteur> getFacteurs() {
        return facteurs;
    }


    public void setFacteurs(List<Facteur> facteurs) {
        this.facteurs = facteurs;
    }

    public List<Habitant> getHabitants() {
        return habitants;
    }

    public void setHabitants(List<Habitant> habitants) {
        this.habitants = habitants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CentrePostal that = (CentrePostal) o;
        return numero == that.numero && Objects.equals(centrePostalId, that.centrePostalId) && Objects.equals(nom, that.nom) && Objects.equals(rue, that.rue) && Objects.equals(quartier, that.quartier) && Objects.equals(ville, that.ville) && Objects.equals(centreRegional, that.centreRegional) && Objects.equals(colis, that.colis) && Objects.equals(facteurs, that.facteurs) && Objects.equals(habitants, that.habitants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centrePostalId, nom, numero, rue, quartier, ville, centreRegional, colis, facteurs, habitants);
    }

    @Override
    public String toString() {
        return "CentrePostal{" +
                "centrePostalId=" + centrePostalId +
                ", nom='" + nom + '\'' +
                ", numero=" + numero +
                ", rue='" + rue + '\'' +
                ", quartier='" + quartier + '\'' +
                ", ville='" + ville + '\'' +
                ", centreRegional=" + centreRegional +
                //", colis=" + colis +
                //", facteurs=" + facteurs +
                //", habitants=" + habitants +
                '}';
    }
}
