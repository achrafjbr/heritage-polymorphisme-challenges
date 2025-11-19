package challenge6;

public class Moto extends Vehicule{
    public Moto(String marque, int modele) {
        super(marque, modele);
    }

    @Override
    public void demarrer() {
        System.out.println("Le Moto demarrer");
    }

    @Override
    public void calculerAutonomie(int reservoirEnLitres, int consommation) {
        double result = (double) (reservoirEnLitres * 100) /consommation;
        System.out.println("La calcule d'autonomie de Moto est :  "+result);
    }
}
