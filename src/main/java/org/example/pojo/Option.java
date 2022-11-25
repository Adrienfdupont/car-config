package org.example.pojo;

public class Option {
    private String name;
    private int price;

    public Option(){
        this.name = "";
        this.price = 0;
    }

    public Option(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }
}
