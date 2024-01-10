package ma.ac.emi.examfacteur.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personneId;
    private String nom;
    private String prenom;
    private String rue;
    private String quartier;
    private String ville;

    public Personne(String nom, String prenom, String rue, String quartier, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
    }

    public Personne() {
    }
}
