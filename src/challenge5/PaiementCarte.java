package challenge5;

public class PaiementCarte extends Paiement{




    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiment par carte, le montant traité est : "+montant);
    }
}
