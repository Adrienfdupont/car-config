package org.example;

import org.example.enumGlobal.Color;
import org.example.enumGlobal.Type;
import org.example.pojo.*;

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
        boolean verif = false;
        boolean choixfinal = false;

        Scanner sc = new Scanner(System.in);


        try {
            while (!choixfinal) {
                Sedan sedan = new Sedan();
                Break breakk = new Break();
                Coupe coupe = new Coupe();
                Suv suv = new Suv();

                // accueil et présentation
                System.out.println("Bienvenue dans notre concession, je vous invite à choisir" +
                        " le type de voiture qui vous intéresserait le plus.");

                // présentation des modèles
                System.out.println("Rentrez le type de véhicule de votre choix:");
                for (Type type : Type.values()) {
                    System.out.print(type + " ");
                }
                System.out.println();


                // récupérer le type de véhicule souhaité par le client
                String modele = "";
                while (!verif) {
                    input = sc.next();
                    for (Type name : Type.values()) {
                        if (input.toLowerCase().equals(name.toString().toLowerCase())) {
                            verif = true;
                            modele = name.toString();
                        }
                    }
                    if (!verif) System.out.println("Type de véhicule incorrect, veuillez réessayer.");
                }
                verif = false;

                // Choisir les options à ajouter
                for (int i = 0; i < options.size(); i++) {
                    System.out.println("Souhaitez-vous ajouter l'option " + options.get(i).getName()
                            + " pour " + options.get(i).getPrice() + " € ?");
                    while (!verif) {
                        input = sc.next();
                        if (input.equals("oui")) {
                            switch (modele){
                                case "Sedan":
                                    sedan.addOption(options.get(i));
                                case "Break":
                                    breakk.addOption(options.get(i));
                                case "SUV":
                                    suv.addOption(options.get(i));
                                case "Coupe":
                                    coupe.addOption(options.get(i));
                            }
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
                switch (modele){
                    case "Sedan":
                        sedan.setColor(input);
                    case "Break":
                        breakk.setColor(input);
                    case "SUV":
                        suv.setColor(input);
                    case "Coupe":
                        coupe.setColor(input);
                }
                verif = false;


                // Présentation du véhicule
                System.out.println("Vous avez choisi un " + modele + " avec le(s) option(s) ci-dessous:");

                switch (modele){
                    case "Sedan":
                        for (int i = 0; i < sedan.getOptions().size(); i++) {
                            System.out.println("- " + sedan.getOptions().get(i).getName());
                        }
                        System.out.println("Livrée en " + sedan.getColor());
                        System.out.println("Cela vous coûtera " + sedan.getPrice() + " €.");
                        break;
                    case "Break":
                        for (int i = 0; i < breakk.getOptions().size(); i++) {
                            System.out.println("- " + breakk.getOptions().get(i).getName());
                        }
                        System.out.println("Livrée en " + breakk.getColor());
                        System.out.println("Cela vous coûtera " + breakk.getPrice() + " €.");
                        break;
                    case "SUV":
                        for (int i = 0; i < suv.getOptions().size(); i++) {
                            System.out.println("- " + suv.getOptions().get(i).getName());
                        }
                        System.out.println("Livrée en " + suv.getColor());
                        System.out.println("Cela vous coûtera " + suv.getPrice() + " €.");
                        break;
                    case "Coupe":
                        for (int i = 0; i < coupe.getOptions().size(); i++) {
                            System.out.println("- " + coupe.getOptions().get(i).getName());
                        }
                        System.out.println("Livrée en " + coupe.getColor());
                        System.out.println("Cela vous coûtera " + coupe.getPrice() + " €.");
                        break;
                }

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
