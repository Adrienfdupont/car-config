package org.example.pojo;

import org.example.enumGlobal.Name;

public class Sneakay extends Car{
    private static int price = 33500;
    private static String type;

    public Sneakay(){
        super();
        this.type = returnType(Name.Sneakay);
        this.setSum(this.getPrice()+price);
    };

    public Sneakay(String numberPlate){
        super(numberPlate, Sneakay.price);
        this.type = returnType(Name.Sneakay);
        this.setSum(this.getPrice()+price);
    };

    public String getType() {
        return this.type;
    }
}
