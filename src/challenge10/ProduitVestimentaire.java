package challenge10;

public class ProduitVestimentaire extends Produit {

    double remiseSaisonniere;


    public ProduitVestimentaire(String nom, double prix, double remiseSaisonniere) {
        super(nom, prix);
        this.remiseSaisonniere=remiseSaisonniere;
    }

    @Override
    public void getPrixFinal() {
        System.out.println(remiseSaisonniere+=prix);
    }
}
