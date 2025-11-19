package challenge5;

public class PaiementVirement extends Paiement{

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiment virement, le montant traité est : "+montant);
    }
}
