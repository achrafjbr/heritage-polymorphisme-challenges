package challenge7;

public class Archer extends Personnage{
    public Archer(String nom, int pointsDeVie) {
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer() {
        System.out.println("Nom "+nom+", point de vie "+pointsDeVie+" ");
    }
}
