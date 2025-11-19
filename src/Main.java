import challenge1.Circle;
import challenge1.Forme;
import challenge1.Rectangle;
import challenge1.Triangle;
import challenge2.Employe;
import challenge2.EmployeCommission;
import challenge2.EmployeHoraire;
import challenge2.Manager;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// Challenge 1 — Formes Géométriques

       /*

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

       */

        ///  Challenge 2 — Employés et Salaires

       /*
        Employe employeHoraire1 = new EmployeHoraire(10,15,"Achraf",30000);
        Employe employeHoraire2 = new EmployeHoraire(40,13,"Samir",30000);
        Employe employeCommission1 = new EmployeCommission(1000,5,"Najib",2000);
        Employe employeCommission2 = new EmployeCommission(100,9,"Najib",2500);
        Employe manager = new Manager("Mohammed",4000,1500);

        List<Employe> employes = new ArrayList<>();
        employes.add(employeHoraire1);
        employes.add(employeHoraire2);
        employes.add(employeCommission1);
        employes.add(employeCommission2);
        employes.add(manager);

        for (Employe emp : employes){
            System.out.println(emp.calculerSalaire());
        }
       */


    }
}