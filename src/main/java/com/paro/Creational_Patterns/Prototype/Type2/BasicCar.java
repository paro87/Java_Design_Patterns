package com.paro.Creational_Patterns.Prototype.Type2;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public abstract class BasicCar implements Cloneable{
    @Getter
    @Setter
    public String modelName;
    public int basePrice, onRoadPrice;

    public static int setAdditionalPrice(){
        int price=0;
        Random r=new Random();
        int p=r.nextInt(10000);
        price=p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar)super.clone();
    }

}
