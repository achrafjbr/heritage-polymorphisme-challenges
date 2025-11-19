package challenge2;

public class Manager extends Employe {

    double prime;

    public Manager(String nom, double salaireBase, int prime) {
        super(nom, salaireBase);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        salaireBase += prime;
        return salaireBase;
    }
}
