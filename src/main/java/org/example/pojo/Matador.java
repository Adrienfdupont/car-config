package org.example.pojo;

import org.example.enumGlobal.Name;

public class Matador extends Car{
    private static int price = 22900;
    private static String type;

    public Matador(){
        super();
        this.type = returnType(Name.Matador);
        this.setSum(this.getPrice()+price);
    };

    public Matador(String numberPlate){
        super(numberPlate, Matador.price);
        this.type = returnType(Name.Matador);
        this.setSum(this.getPrice()+price);
    };

    public String getType() {
        return this.type;
    }
}
