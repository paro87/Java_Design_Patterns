package com.paro.Additional_Patterns.SimpleFactoryPattern;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("How-how");
    }

    @Override
    public void preferredAction() {
        System.out.println("Barking");
    }
}
