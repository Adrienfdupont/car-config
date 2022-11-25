package org.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private Integer price;
    private List<Option> options = new ArrayList<>();
    private String color;

    public Car(){
        this.price = 0;
        this.name = "";
    }

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }

    // getter and setter

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<Option> getOptions() {
        return this.options;
    }

    // add option and set sum
    public void addOption(Option option) {
        this.options.add(option);
        this.price += option.getPrice();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
