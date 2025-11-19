package challenge5;

public class PaiementCash extends Paiement{

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiment Cash, le montant traité est : "+montant);
    }
}
