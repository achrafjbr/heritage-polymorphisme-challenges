package challenge1;

public class Circle extends Forme{
    private double rayon;

    public Circle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return 3.14 * (rayon*rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
