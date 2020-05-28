package com.paro.Creational_Patterns.Prototype.Type2;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar nano = new Nano("Green Nano");
        nano.basePrice=100000;

        BasicCar ford = new Ford("Ford Yellow");
        ford.basePrice = 500000;

        BasicCar basicCar;
        basicCar=nano.clone();
        basicCar.onRoadPrice=nano.basePrice+BasicCar.setAdditionalPrice();

        basicCar=ford.clone();
        basicCar.onRoadPrice=ford.basePrice+BasicCar.setAdditionalPrice();


    }
}
