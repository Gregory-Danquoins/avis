package fr.humanbooster.avis.business;

import java.time.LocalDate;
import java.util.Objects;

public class Joueur extends Utilisateur{
    private LocalDate dateDeNaissance;

    public Joueur() {
        super();
    }

    public Joueur(String pseudo,String motDePasse,String email,LocalDate dateDeNaissance) {
        super(pseudo,motDePasse,email);
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }


    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Joueur joueur = (Joueur) o;
        return Objects.equals(dateDeNaissance, joueur.dateDeNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateDeNaissance);
    }

    @Override
    public String toString() {
        return "Joueur{" + super.toString() + "dateDeNaissance=" + dateDeNaissance + '}';
    }
}
