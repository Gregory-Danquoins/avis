package business;

import java.time.LocalDate;

public class Jeu {
    private Long id;
    private String nom;
    private LocalDate dateDeSortie;
    private String description;
    private boolean possedeImage;
    private static Long compteur = 0L;
    // private Editeur editeur; //TODO: Générer getters & setters + constructor + toString();

    /**
     * Constructeur défault
     */
    public Jeu() {
        this.id = ++compteur;
    }

    /**
     * Constructeur
     * @param nom Nom du jeu
     */
    public Jeu(String nom) {
        this.nom = nom;
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

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPossedeImage() {
        return possedeImage;
    }

    public void setPossedeImage(boolean possedeImage) {
        this.possedeImage = possedeImage;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Jeu.compteur = compteur;
    }

    public String toString() {
        return "Jeu " +
                "[#id=" + id + ", nom= " + nom + "]";
    }
}