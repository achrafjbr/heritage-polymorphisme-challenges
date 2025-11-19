package challenge6;

public class Camion extends Vehicule{
    public Camion(String marque, int modele) {
        super(marque, modele);
    }
    @Override
    public void demarrer() {
        System.out.println("Le Camion demarrer");
    }

    @Override
    public void calculerAutonomie(int reservoirEnLitres, int consommation) {
        double result = (double) (reservoirEnLitres * 100) /consommation;
        System.out.println("La calcule d'autonomie de Camion est :  "+result);
    }
}
