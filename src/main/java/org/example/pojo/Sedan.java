package org.example.pojo;

public class Sedan extends Car{
    private static Integer price = 24500;

    public Sedan(){
        super(Sedan.price);
    }
}
