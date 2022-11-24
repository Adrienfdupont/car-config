package org.example.pojo;

import org.example.enumGlobal.Name;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String numberPlate;
    private Integer sum;
    private List<Option> options = new ArrayList<>();

    public Car(){
        this.numberPlate = "";
        this.sum = 0;
    }

    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
        this.sum = 0;
    }

    // getter and setter
    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public List<Option> getOptions() {
        return this.options;
    }

    // in = name; return = type
    public String returnType(Name name) {
        switch (name) {
            case Beaufy:
                return "sedan";
            case Daron:
                return "break";
            case Matador:
                return "SUV";
            case Sneakay:
                return "coupe";
            default:
                return "";
        }
    }

    // add option and set sum
    public void addOption(Option option) {
        this.options.add(option);
        this.sum += option.getPrice();
    }
}
