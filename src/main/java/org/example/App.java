package org.example;


import org.example.enumGlobal.Name;
import org.example.enumGlobal.Type;
import org.example.pojo.Beaufy;
import org.example.pojo.Car;
import org.example.pojo.Option;

import java.util.InputMismatchException;
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
        Option option1 = new Option("sunRoof", 500);
        Option option2 = new Option("airCon", 300);
        Option option3 = new Option("heatingSeats", 350);
        Option option4 = new Option("openRoof", 650);
        Option option5 = new Option("5Doors", 700);

        /* accueil et présentation */
        System.out.println("Bienvenue dans notre concession, je vous invite à choisir" +
                " le type de voiture qui vous intéresserait le plus");

        /* présentation des modèles */
        Scanner sc = new Scanner(System.in);
        System.out.println("Rentrez le type de véhicule de votre choix");
        for (Type type : Type.values()) {
            System.out.println(type);
        }

        /* récupérer le type de véhicule souhaité par le client */
        String input = "";
        boolean verif = false;
        while (!verif){
            try {
                input = sc.next();
                for (Type type : Type.values()) {
                    if (input.equals(type.toString())){
                        verif = true;
                        sc.close();
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Veuillez saisir un type de véhicule");
                sc.next();
            }
        }

        String type = sc.next();
        System.out.println("Vous recherchez un " + type);

        /* trouver le modèle correspondant au type de véhicule saisi */

    }
}
