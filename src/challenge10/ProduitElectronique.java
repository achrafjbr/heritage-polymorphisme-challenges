package challenge10;

public class ProduitElectronique extends Produit {

    double taxeEcologique;

    public ProduitElectronique(String nom, double prix,double taxeEcologique) {
        super(nom, prix);
        this.taxeEcologique = taxeEcologique;
    }

    @Override
    public void getPrixFinal() {
        System.out.println(prix*taxeEcologique);
    }
}
