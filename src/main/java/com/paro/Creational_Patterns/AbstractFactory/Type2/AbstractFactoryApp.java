package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        AnimalFactory myAnimalFactory;
        Dog myDog;
        Tiger myTiger;

        myAnimalFactory=new WildAnimalFactory();
        myDog=myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();

        myTiger=myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();

        myAnimalFactory=new PetAnimalFactory();
        myDog=myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();

        myTiger=myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
    }

}
