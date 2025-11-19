package challenge4;

public class CompteEpargne extends Compte {

     final double tauxInteret = 0.2;

    public CompteEpargne(int numero, double solde) {
        super(numero, solde);
    }


    public void appliquerInteret(double montant) {
        solde-=montant;
        solde -= (solde * tauxInteret);
    }

    @Override
    public void verser(double montant) {
        solde+=montant;
        System.out.println("Votre courrant solde est : "+solde);
    }

    @Override
    public void retirer(double montant) {
        appliquerInteret(montant);
        System.out.println("Votre courrant solde aprés l'intéret est: "+solde);

    }
}
