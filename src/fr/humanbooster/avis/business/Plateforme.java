package fr.humanbooster.avis.business;

import java.util.Objects;

public class Plateforme {
    private String nom;
    private Long id;
    private static  Long compteur = 0L;

    public Plateforme(String nom) {
        this.nom = nom;
        this.id = ++compteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Plateforme.compteur = compteur;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Plateforme that)) return false;
        return Objects.equals(nom, that.nom) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, id);
    }

    @Override
    public String toString() {
        return "Plateforme{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                '}';
    }
}
