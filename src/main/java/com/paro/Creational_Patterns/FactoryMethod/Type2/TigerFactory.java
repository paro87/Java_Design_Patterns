package com.paro.Creational_Patterns.FactoryMethod.Type2;

public class TigerFactory extends AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
