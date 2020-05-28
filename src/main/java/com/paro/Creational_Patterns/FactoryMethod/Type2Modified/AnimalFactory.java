package com.paro.Creational_Patterns.FactoryMethod.Type2Modified;

abstract class AnimalFactory {
    public abstract Animal createAnimal();
    public Animal makeAnimal() {
        Animal animal=createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }
}
