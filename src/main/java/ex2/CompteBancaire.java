package ex2;

public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private String name;

    public CompteBancaire() {
    }

    public CompteBancaire(String num_compte, double solde, String name) {
        this.numeroCompte = num_compte;
        this.solde = solde;
        this.name = name;
    }


    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Solde insuffisant pour effectuer le retrait.");
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + this.numeroCompte + " : " + solde);
    }

    public void transfertArgent(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Solde insuffisant pour effectuer le transfert.");
        }
        if (destinataire == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        }
        this.retirer(montant);
        destinataire.deposer(montant);
        System.out.println("Transfert de " + montant + " effectué vers le compte " + destinataire.numeroCompte);
    }
}
