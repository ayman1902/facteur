package ma.ac.emi.examfacteur.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
public class Colis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colisId;
    private Long numero;
    private Date dateDepot;
    private Date dateReception;

    public Colis(Long numero, Date dateDepot, Date dateReception) {
        this.numero = numero;
        this.dateDepot = dateDepot;
        this.dateReception = dateReception;
    }

    public Colis() {
    }

    @ManyToMany
    @JoinTable(
            name = "coco",
            joinColumns = @JoinColumn(name = "colisId"),
            inverseJoinColumns = @JoinColumn(name = "centrePostalId")
    )
    private List<CentrePostal> centrePostals;
    @ManyToOne
    private Facteur facteur;
    @ManyToOne
    private Habitant habitant_emetteur;
    @ManyToOne
    private Habitant habitant_destinataire;

    public Long getColisId() {
        return colisId;
    }

    public void setColisId(Long colisId) {
        this.colisId = colisId;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public List<CentrePostal> getCentrePostals() {
        return centrePostals;
    }

    public void setCentrePostals(List<CentrePostal> centrePostals) {
        this.centrePostals = centrePostals;
    }

    public Facteur getFacteur() {
        return facteur;
    }

    public void setFacteur(Facteur facteur) {
        this.facteur = facteur;
    }

    public Habitant getHabitant_emetteur() {
        return habitant_emetteur;
    }

    public void setHabitant_emetteur(Habitant habitant_emetteur) {
        this.habitant_emetteur = habitant_emetteur;
    }

    public Habitant getHabitant_destinataire() {
        return habitant_destinataire;
    }

    public void setHabitant_destinataire(Habitant habitant_destinataire) {
        this.habitant_destinataire = habitant_destinataire;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colis colis = (Colis) o;
        return Objects.equals(colisId, colis.colisId) && Objects.equals(numero, colis.numero) && Objects.equals(dateDepot, colis.dateDepot) && Objects.equals(dateReception, colis.dateReception) && Objects.equals(centrePostals, colis.centrePostals) && Objects.equals(facteur, colis.facteur) && Objects.equals(habitant_emetteur, colis.habitant_emetteur) && Objects.equals(habitant_destinataire, colis.habitant_destinataire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colisId, numero, dateDepot, dateReception, centrePostals, facteur, habitant_emetteur, habitant_destinataire);
    }

    @Override
    public String toString() {
        return "Colis{" +
                "colisId=" + colisId +
                ", numero=" + numero +
                ", dateDepot=" + dateDepot +
                ", dateReception=" + dateReception +
                ", centrePostals=" + centrePostals +
                ", facteur=" + facteur +
                ", habitant=" + habitant_destinataire +
                ", habitant=" + habitant_emetteur +
                '}';
    }
}
