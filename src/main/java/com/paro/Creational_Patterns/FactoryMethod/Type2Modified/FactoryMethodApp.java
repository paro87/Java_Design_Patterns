package com.paro.Creational_Patterns.FactoryMethod.Type2Modified;

public class FactoryMethodApp {
    public static void main(String[] args) {
        AnimalFactory tigerFactory=new TigerFactory();
        Animal aTiger=tigerFactory.makeAnimal();

        AnimalFactory dogFactory=new DogFactory();
        Animal aDog=dogFactory.makeAnimal();
    }
}
