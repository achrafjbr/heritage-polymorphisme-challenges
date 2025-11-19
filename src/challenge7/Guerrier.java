package challenge7;

public class Guerrier extends Personnage {
    public Guerrier(String nom, int pointsDeVie) {
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer() {
        System.out.println("Nom " + nom + ", point de vie " + pointsDeVie + " ");
    }
}
