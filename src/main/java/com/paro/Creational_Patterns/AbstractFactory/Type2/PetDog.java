package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class PetDog implements Dog{

    @Override
    public void speak() {
        System.out.println("Pet dog speaks");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet dog moves");

    }
}
