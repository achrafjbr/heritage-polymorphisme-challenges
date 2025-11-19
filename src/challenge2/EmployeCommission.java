package challenge2;

public class EmployeCommission extends Employe {

    int ventes;
    double commission;

    public EmployeCommission(int ventes, double commission, String nom, double salaireBase) {
        super(nom, salaireBase);
        this.ventes = ventes;
        this.commission = commission;
    }

    @Override
    public double calculerSalaire() {
        salaireBase += ventes*commission;
        return salaireBase;
    }
}
