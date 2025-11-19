package challenge6;

public class Voiture extends Vehicule{
    public Voiture(String marque, int modele) {
        super(marque, modele);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture demarrer");
    }

    @Override
    public void calculerAutonomie(int reservoirEnLitres, int consommation) {
        double result = (double) (reservoirEnLitres * 100) /consommation;
        System.out.println("La calcule d'autonomie de Voiture est :  "+result);
    }
}
