package fr.humanbooster.avis;

import fr.humanbooster.avis.business.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // --- ÉDITEURS
        ArrayList<Editeur> editeurs = new ArrayList<>();

        Editeur editeur1 = new Editeur("Ubisoft", "Truc rond bleu");
        Editeur editeur2 = new Editeur("Warhorse Studio", "Rearing horse");
        Editeur editeur3 = new Editeur("Electronic Arts", "EA");
        Editeur editeur4 = new Editeur("Riot", "A closed fist");
        Collections.addAll(editeurs, editeur1, editeur2, editeur3, editeur4);

        // --- PLATEFORMES
        ArrayList<Plateforme> plateformes = new ArrayList<>();

        Plateforme plateformePs5 = new Plateforme("PS5");
        Plateforme plateformeXbox = new Plateforme("XBox");
        Plateforme plateformePc = new Plateforme("PC");
        Plateforme plateformeAndroid = new Plateforme("Android");
        Collections.addAll(plateformes, plateformePs5, plateformeXbox, plateformePc, plateformeAndroid);

        // --- UTILISATEURS
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

        Moderateur moderateur = new Moderateur("Sam", "p@s$w0rd", "sam@admin.test", "0600000000");
        Joueur joueur1 = new Joueur("Matt", "p@s$w0rd","matt@user.test", LocalDate.of(1970, 1, 1));
        Joueur joueur2 = new Joueur("Matt", "p@s$w0rd","matt@user.test", LocalDate.of(1970, 1, 1));
        Collections.addAll(utilisateurs, moderateur, joueur1, joueur2);

        System.out.println("----- PRINT -----");

        //--- Cast
        for (Utilisateur utilisateur : utilisateurs) {
            // Vérifier la classe de l'objet & l'instancier + caster dans une variable pour l'utiliser dans l'IF
            // (pratique si on doit l'utiliser plusieurs fois)
            if (utilisateur instanceof  Moderateur mod) {
                System.out.println("(Modérateur) " +  mod);
                System.out.println("-- Tél: " + mod.getNumeroDeTelephone());
                // Vérifier la classe de l'objet et (une fois dans l'IF) le caster pour l'utiliser
                // (pratique si on doit l'utiliser une seule fois)
            } else if(utilisateur instanceof Joueur) {
                System.out.println("(Joueur) " +  utilisateur);
                System.out.println("-- Date de naissance: " + ((Joueur) utilisateur).getDateDeNaissance());
            } else {
                System.out.println("(Utilisateur) " +  utilisateur);
            }

            System.out.println("--- Equals (joueur1 & joueur2): " + joueur1.equals(joueur2));
            System.out.println("--- HashCode Joueur1: " + joueur1.hashCode());
            System.out.println("--- HashCode Joueur2: " + joueur2.hashCode());
        }

        //--- Comparer des tableaux
        // La méthode `Collections.sort()` va utiliser la méthode `compareTo()` de la classe `Editeur` pour ordonner la liste d'éditeurs.
        Collections.sort(editeurs);
        System.out.println("Éditeurs: " + editeurs);

        Collections.sort(plateformes);
        System.out.println("Plateformes: " + plateformes);
    }
}