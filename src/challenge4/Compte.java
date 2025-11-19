package challenge4;

abstract public class Compte {
    int numero;
    double solde;
    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    abstract public void verser(double montant);

    abstract public void retirer(double montant);

}
