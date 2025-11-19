package challenge4;

public class CompteCourant extends Compte {
    final double limit = 10000;

    public CompteCourant(int numero, double solde) {
        super(numero, solde);
    }

    @Override
    public void verser(double montant) {

        if ( montant + solde>= limit ) {
            System.out.println("Vous avez atteindre la limit !");
        } else {
            solde += montant;
            System.out.println("Votre courrant solde est : " + solde);
        }
    }

    @Override
    public void retirer(double montant) {
        solde-=montant;
        System.out.println("Votre courrant solde est : "+solde);
    }

}
