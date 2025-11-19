package challenge7;

abstract public class Personnage {

    String nom;
    int pointsDeVie;

    public Personnage(String nom, int pointsDeVie) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
    }

    abstract public void attaquer();
}
