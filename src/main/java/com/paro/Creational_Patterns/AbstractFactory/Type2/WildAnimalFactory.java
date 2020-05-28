package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class WildAnimalFactory implements AnimalFactory{

    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }
}
