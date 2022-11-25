package org.example.pojo;

public class Suv extends Car{
    private static Integer price = 22000;

    public Suv(){
        super(Suv.price);
    }
}
