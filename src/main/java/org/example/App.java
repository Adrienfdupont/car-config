package org.example;


import org.example.pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

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

    }
}
