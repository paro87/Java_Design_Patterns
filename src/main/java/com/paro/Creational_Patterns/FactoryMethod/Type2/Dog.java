package com.paro.Creational_Patterns.FactoryMethod.Type2;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("How-how");
    }

    @Override
    public void preferredAction() {
        System.out.println("Barking");
    }
}
