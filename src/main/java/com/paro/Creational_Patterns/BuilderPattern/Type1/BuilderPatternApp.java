package com.paro.Creational_Patterns.BuilderPattern.Type1;

//THe object construction in constructor is  type of design closely ties the object construction process with the
//components that make up the object. This approach is suitable as long as the object under construction is simple and the object
//construction process is definite and always produces the same representation of the object.

//The Builder pattern suggests moving the construction logic out of the object class to a separate class referred to as a builder class.

public class BuilderPatternApp {
    public static void main(String[] args) {
        CarBuilder carBuilder=new SedanCarBuilder();
        CarDirector director=new CarDirector(carBuilder);
        director.build();
        Car car =carBuilder.getCar();
        System.out.println(car);

        carBuilder=new SportsCarBuilder();
        director=new CarDirector(carBuilder);
        director.build();
        car=carBuilder.getCar();
        System.out.println(car);



    }
}
