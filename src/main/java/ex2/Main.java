package ex2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        // Ajouter des comptes
        comptes.add(new CompteCourant("123", 1000, "John Doe", 500));
        comptes.add(new CompteEpargne("456", 2000, "Jane Smith", 0.05));

        // Effectuer des opérations sur les comptes
        try {
            comptes.get(0).deposer(500);
            comptes.get(1).retirer(300);
            comptes.get(0).transfertArgent(comptes.get(1), 200);
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

}
