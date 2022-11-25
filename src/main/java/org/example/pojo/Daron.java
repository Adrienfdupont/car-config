package org.example.pojo;

import org.example.enumGlobal.Name;

public class Daron extends  Car{
    private static int price = 26100;
    private static String type;

    public Daron(){
        super();
        this.type = returnType(Name.Daron);
        this.setSum(this.getPrice()+price);
    };

    public Daron(String numberPlate){
        super(numberPlate, Daron.price);
        this.type = returnType(Name.Daron);
        this.setSum(this.getPrice()+price);
    };

    public String getType() {
        return this.type;
    }
}
