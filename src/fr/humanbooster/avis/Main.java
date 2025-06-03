package fr.humanbooster.avis;

import fr.humanbooster.avis.business.Joueur;
import fr.humanbooster.avis.business.Moderateur;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Moderateur moderateur = new Moderateur("Sam", "", "sam@admin.test", "");
        System.out.println("- " + moderateur);

        Joueur joueur1 = new Joueur("Matt", "","", LocalDate.of(1970, 1, 1));
        Joueur joueur2 = new Joueur("Matt", "","", LocalDate.of(1970, 1, 1));

        System.out.println("- " + joueur1);
        System.out.println("--- Equals: " + joueur1.equals(joueur2));
        System.out.println("--- HashCode Joueur1: " + joueur1.hashCode());
        System.out.println("--- HashCode Joueur2: " + joueur2.hashCode());
    }
}