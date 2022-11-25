package org.example.pojo;


public class Coupe extends Car{
    private static Integer price = 32000;

    public Coupe(){
        super(Coupe.price);
    }
}
