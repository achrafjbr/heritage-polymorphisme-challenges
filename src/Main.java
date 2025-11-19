import challenge1.Circle;
import challenge1.Forme;
import challenge1.Rectangle;
import challenge1.Triangle;
import challenge2.Employe;
import challenge2.EmployeCommission;
import challenge2.EmployeHoraire;
import challenge2.Manager;
import challenge3.Animal;
import challenge3.Chat;
import challenge3.Chien;
import challenge3.Vache;
import challenge4.Compte;
import challenge4.CompteCourant;
import challenge4.CompteEpargne;
import challenge5.*;
import challenge6.Camion;
import challenge6.Moto;
import challenge6.Vehicule;
import challenge6.Voiture;
import challenge7.Archer;
import challenge7.Guerrier;
import challenge7.Mage;
import challenge7.Personnage;
import challenge8.*;
import challenge9.Document;
import challenge9.Image;
import challenge9.PDF;
import challenge9.WORD;

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

        ///  Challenge 3 — Animaux et Sons
        /*
        Animal chat =  new Chat();
        Animal chien =  new Chien();
        Animal vache =  new Vache();
        List <Animal> animals = new ArrayList<>();
        animals.add(chat);
        animals.add(chien);
        animals.add(vache);
        for (Animal animal:animals){animal.faireSon();}
         */


        /// Challenge 4 — Banque : Comptes


        /*
          Compte compteCourant = new CompteCourant(1111,10000);
        compteCourant.verser(100);
        compteCourant.retirer(200);
        Compte compteEpargne = new CompteEpargne(1111,10000);
        compteEpargne.verser(100);
        compteCourant.retirer(500);
         */

        /// Challenge 5 — Paiement : Polymorphisme
        /*
        new TraitementPaiment().traiterPaiement(new PaiementVirement(),100);
        new TraitementPaiment().traiterPaiement(new PaiementCarte(),100);
        new TraitementPaiment().traiterPaiement(new PaiementCash(),100);
         */

        /// Challenge 6 — Transport : Véhicules

        /*
        Vehicule voiture = new Voiture("x", 2010);
        voiture.demarrer();
        voiture.calculerAutonomie(10, 4);

        Vehicule camion = new Camion("y", 2000);
        camion.demarrer();
        camion.calculerAutonomie(17, 6);

        Vehicule Moto = new Moto("m", 2020);
        Moto.demarrer();
        Moto.calculerAutonomie(5, 2);

         */

        ///  Challenge 7 — Jeux Vidéo : Personnages

        /*
        Personnage guerrier = new Guerrier("Guerrier", 10);
        Personnage mage = new Mage("Mage", 18);
        Personnage archer = new Archer("Archer", 13);

        List<Personnage> personnages = new ArrayList<>();
        personnages.add(guerrier);
        personnages.add(mage);
        personnages.add(archer);

        for (Personnage personnage : personnages) {
            personnage.attaquer();
        }
         */

        /// Challenge 8 — Notifications

        /*
        List<Notification> notifications =  new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());
        new Notify().notifierTous(notifications,"Hello guys");

         */

        ///  Challenge 9 — Documents : Affichage

       /*
        List<Document> documents = new ArrayList<>();

        documents.add(new PDF());
        documents.add(new WORD());
        documents.add(new Image());

        for (Document document:documents){
            document.afficher();
        }

        */

        /// Challenge 10 — Boutique : Produits


    }
}