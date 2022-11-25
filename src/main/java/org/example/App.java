package org.example;

import org.example.enumGlobal.Color;
import org.example.enumGlobal.Name;
import org.example.pojo.Car;
import org.example.pojo.Option;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

/**
 *  TODO: Faire une boucle while pour les options
 *  TODO: Pouvoir afficher le prix à la fin
 *  TODO: Réinitialiser
 */

public class App 
{
    public static void main( String[] args )
    {
        // initialisation des options
        List<Option> options = new ArrayList<>();
        options.add(new Option("sunRoof", 500));
        options.add(new Option("airCon", 300));
        options.add(new Option("heatingSeats", 350));
        options.add(new Option("openRoof", 650));
        options.add(new Option("5Doors", 700));

        String input = "";
        Car car;
        boolean verif = false;
        boolean choixfinal = false;

        Scanner sc = new Scanner(System.in);


        try {
            while (!choixfinal) {

                // accueil et présentation
                System.out.println("Bienvenue dans notre concession, je vous invite à choisir" +
                        " le type de voiture qui vous intéresserait le plus.");

                // présentation des modèles
                System.out.println("Rentrez le type de véhicule de votre choix:");
                for (Name type : Name.values()) {
                    System.out.print(type + " ");
                }
                System.out.println();


                // récupérer le type de véhicule souhaité par le client
                while (!verif) {
                    input = sc.next();
                    for (Name name : Name.values()) {
                        if (input.toLowerCase().equals(name.toString().toLowerCase())) {
                            verif = true;
                            input = name.toString();
                        }
                    }
                    if (!verif) System.out.println("Type de véhicule incorrect, veuillez réessayer.");
                }

                verif = false;

                // instancier la voiture
                int basePrice = 0;
                switch (input) {
                    case "Sedan":
                        basePrice = 24500;
                        break;
                    case "Break":
                        basePrice = 26500;
                        break;
                    case "SUV":
                        basePrice = 22000;
                        break;
                    case "Coupe":
                        basePrice = 32000;
                        break;
                }


                car = new Car(basePrice, input);

                System.out.println("Vous recherchez un " + input + ". Le prix de base est de " + car.getPrice() + " €.");


                // Choisir les options à ajouter
                for (int i = 0; i < options.size(); i++) {
                    System.out.println("Souhaitez-vous ajouter l'option " + options.get(i).getName()
                            + " pour " + options.get(i).getPrice() + " € ?");
                    while (!verif) {
                        input = sc.next();
                        if (input.equals("oui")) {
                            car.addOption(options.get(i));
                            verif = true;
                        } else if (input.equals("non")) verif = true;
                        else System.out.println("Veuillez choisir par oui ou non.");
                    }
                    verif = false;
                }

                // Choisir la couleur
                System.out.println("Veuillez sélectionner la couleur de votre choix");
                for (Color color : Color.values()) {
                    System.out.println(color);
                }

                while (!verif) {
                    input = sc.next();
                    for (Color color : Color.values()) {
                        if (input.toLowerCase().equals(color.toString().toLowerCase())) {
                            verif = true;
                        }
                    }
                    if (!verif) System.out.println("couleur incorrecte, veuillez réessayer.");
                }
                car.setColor(input);
                verif = false;


                // Présentation du véhicule
                System.out.println("Vous avez choisi un " + car.getName() + " avec le(s) option(s) ci-dessous:");
                for (int i = 0; i < car.getOptions().size(); i++) {
                    System.out.println("- " + car.getOptions().get(i).getName());
                }
                System.out.println("Livrée en " + car.getColor());
                System.out.println("Cela vous coûtera " + car.getPrice() + " €.");
                System.out.println("Souhaitez-vous recommencer votre commande ?");

                while (!verif) {
                    input = sc.next();
                    if (input.equals("oui")) verif = true;
                    else if (input.equals("non")) {
                        verif = true;
                        choixfinal = true;
                    }
                    else System.out.println("Veuillez choisir par oui ou non.");
                }
                verif = false;
            }

            System.out.println("Nous vous remercions pour votre commande, nous réglerons celle-ci dans quelques instants.");

        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
