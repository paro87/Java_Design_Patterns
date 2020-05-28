package com.paro.Creational_Patterns.Prototype.Type2;

public class Nano extends BasicCar{
    public int basePrice=10000;
    public Nano(String m){
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }
}
