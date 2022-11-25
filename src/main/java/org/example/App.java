package org.example;

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
public class App 
{
    public static void main( String[] args )
    {
        /* initialisation des options */
        List<Option> options = new ArrayList<>();
        options.add(new Option("sunRoof", 500));
        options.add(new Option("airCon", 300));
        options.add(new Option("heatingSeats", 350));
        options.add(new Option("openRoof", 650));
        options.add(new Option("5Doors", 700));

        /* accueil et présentation */
        System.out.println("Bienvenue dans notre concession, je vous invite à choisir" +
                " le type de voiture qui vous intéresserait le plus");

        /* présentation des modèles */
        Scanner sc = new Scanner(System.in);
        System.out.println("Rentrez le type de véhicule de votre choix");
        for (Name type : Name.values()) {
            System.out.println(type);
        }

        /* récupérer le type de véhicule souhaité par le client */
        String input = "";
        boolean verif = false;
        while (!verif){
            try {
                input = sc.next();
                for (Name name : Name.values()) {
                    if (input.equals(name.toString())){
                        verif = true;
                        sc.close();
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Veuillez saisir un type de véhicule");
                sc.next();
            }
        }

        /* instancier la voiture */
        int basePrice = 0;
        switch (input){
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

        Car car = new Car(basePrice, input);

        System.out.println("Vous recherchez un " + input + ". Le prix de base est de " + car.getPrice() + " €.");

        /* ajouter les options */
        for (int i = 0; i < options.size(); i++) {
            System.out.println("Souhaitez-vous ajouter " + options.get(i).getName()
                    + " pour " + options.get(i).getPrice() + " € ?");
            Scanner sc2 = new Scanner(System.in);
            verif = false;
            String answer = "";
            while (!verif){
                answer  = sc2.next();
                if (answer.equals("oui") || answer.equals("non")){
                    verif = true;
                }
            }
        }
    }
}
