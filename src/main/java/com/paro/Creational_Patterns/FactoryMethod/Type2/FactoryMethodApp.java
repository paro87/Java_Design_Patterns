package com.paro.Creational_Patterns.FactoryMethod.Type2;

public class FactoryMethodApp {
    public static void main(String[] args) {
        AnimalFactory tigerFactory=new TigerFactory();
        Animal aTiger=tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        AnimalFactory dogFactory=new DogFactory();
        Animal aDog=dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }
}
