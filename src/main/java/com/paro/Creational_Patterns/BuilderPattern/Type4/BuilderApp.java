package com.paro.Creational_Patterns.BuilderPattern.Type4;

public class BuilderApp {
    public static void main(String[] args) {
        final ProductClass customCar1=new CarBuilder().addHeadlights(5)
                .buildBody("Plastic")
                .constructCar();
        System.out.println(customCar1);

        ModifiedBuilder carBuilder2=new CarBuilder();
        final ProductClass customCar2=carBuilder2.insertWheels(7)
                .addHeadlights(6)
                .startUpOperations("Making car")
                .constructCar();
        System.out.println(customCar2);

        final ProductClass custom3=carBuilder2.getConstructedCar();
        System.out.println(custom3);
    }
}
