package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class PetAnimalFactory implements AnimalFactory{

    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger() {
        return new PetTiger();
    }
}
