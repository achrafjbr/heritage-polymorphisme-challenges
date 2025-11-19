package challenge10;

public class ProduitAlimentaire extends Produit {

    double reduction;

    public ProduitAlimentaire(String nom, double prix, double reduction) {
        super(nom, prix);
        this.reduction=reduction;
    }

    @Override
    public void getPrixFinal() {
        System.out.println(prix-=reduction);
    }
}
