package com.paro.Creational_Patterns.FactoryMethod.Type2Modified;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
