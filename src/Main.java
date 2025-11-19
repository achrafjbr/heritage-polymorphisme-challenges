import challenge1.Circle;
import challenge1.Forme;
import challenge1.Rectangle;
import challenge1.Triangle;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// Challenge 1 — Formes Géométriques

        // Appliquer le principle : (liskov substitution)

        Forme circle = new Circle(21);
        Forme rectangle = new Rectangle(10,6);
        Forme triangle =  new Triangle(10,22);

        List<Forme> formes = new ArrayList<>();

        formes.add(circle);
        formes.add(rectangle);
        formes.add(triangle);

        for (Forme frm : formes){
            System.out.println(frm.calculerAire());
        }


    }
}