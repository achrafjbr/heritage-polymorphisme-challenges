package challenge7;

public class Mage extends Personnage{
    public Mage(String nom, int pointsDeVie) {
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer() {
        System.out.println("Nom "+nom+", point de vie "+pointsDeVie+" ");
    }
}
