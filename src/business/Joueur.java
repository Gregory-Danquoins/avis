package business;

import java.time.LocalDate;

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
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }

}
