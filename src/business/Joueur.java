package business;

import java.time.LocalDate;

public class Joueur extends Utilisateur{
    private Long id;
    private LocalDate dateDeNaissance;
    private static Long compteur = 0L;

    public Joueur() {
        this.id = compteur++;
    }

    public Joueur(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }


    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }
}
