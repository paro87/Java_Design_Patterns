package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class PetTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Pet tiger speaks");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet tiger moves");
    }
}
