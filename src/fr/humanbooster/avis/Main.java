package fr.humanbooster.avis;

import fr.humanbooster.avis.business.Joueur;
import fr.humanbooster.avis.business.Moderateur;
import fr.humanbooster.avis.business.Utilisateur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

        Moderateur moderateur = new Moderateur("Sam", "", "sam@admin.test", "");
        Joueur joueur1 = new Joueur("Matt", "","", LocalDate.of(1970, 1, 1));
        Joueur joueur2 = new Joueur("Matt", "","", LocalDate.of(1970, 1, 1));

        Collections.addAll(utilisateurs, moderateur, joueur1, joueur2);

        System.out.println("----- PRINT -----");

        for (Utilisateur utilisateur : utilisateurs) {
            // Vérifier la classe de l'objet & l'instancier + caster dans une variable pour l'utiliser dans l'IF
            // (pratique si on doit l'utiliser plusieurs fois)
            if (utilisateur instanceof  Moderateur mod) {
                System.out.println("(Moderateur) " +  mod);
                System.out.println("--Tél: " + mod.getNumeroDeTelephone());
                // Vérifier la classe de l'objet et - une fois dans l'IF — le caster pour l'utiliser
                // (pratique si on doit l'utiliser une seule fois)
            } else if(utilisateur instanceof Joueur) {
                System.out.println("(Joueur) " +  utilisateur);
                System.out.println("-- Date de naissance: " + ((Joueur) utilisateur).getDateDeNaissance());
            } else {
                System.out.println("(Utilisateur) " +  utilisateur);
            }
        }
    }
}