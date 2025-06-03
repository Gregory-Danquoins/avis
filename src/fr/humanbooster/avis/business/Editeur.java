package fr.humanbooster.avis.business;

import java.util.Objects;

public class Editeur implements Comparable<Editeur> {

    private Long id;
    private String nom;
    private String logo;

    private static Long compteur = 0L;

    /**
     * Constructeur par défaut
     */
    public Editeur() {
        id = ++compteur;
    }

    /**
     * Constructeur
     * @param nom Nom de l'éditeur
     * @param logo Logo de l'éditeur
     */
    public Editeur(String nom, String logo) {
        this();
        this.nom = nom;
        this.logo = logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Editeur editeur = (Editeur) o;
        return Objects.equals(id, editeur.id) && Objects.equals(nom, editeur.nom) && Objects.equals(logo, editeur.logo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(nom);
        result = 31 * result + Objects.hashCode(logo);
        return result;
    }

    /**
     * Montre à Java comment comparer deux objets "Editeur" : l'objet "this" et l'objet "Editeur" donné en paramètre.
     * On décide de comparer les éditeurs sur leurs noms.
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Editeur o) {
        return getNom().compareTo(o.getNom());
    }

    @Override
    public String toString() {
        return "Éditeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}