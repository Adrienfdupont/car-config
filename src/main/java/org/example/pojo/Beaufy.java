package org.example.pojo;

import org.example.enumGlobal.Name;

public class Beaufy extends  Car{
    static private int price = 24300;
    private int power = 0;
    private String type;

    public Beaufy(){
        super();
        this.type = returnType(Name.Beaufy);
        this.setSum(this.getSum()+price);
    };

    public Beaufy(String numberPlate){
        super(numberPlate);
        this.type = returnType(Name.Beaufy);
        this.setSum(this.getSum()+price);
    };

    public String getType() {
        return this.type;
    }
}
