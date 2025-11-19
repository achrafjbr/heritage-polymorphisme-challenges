package challenge2;

public class EmployeHoraire extends Employe {
    int heuresTravaillees;
    double tauxHoraire;

    public EmployeHoraire(int heuresTravaillees, double tauxHoraire,String nom, double salaireBase) {
        super(nom,salaireBase);
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
         salaireBase += heuresTravaillees*tauxHoraire;
        return salaireBase ;
    }
}
