package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class WildDog implements Dog{
    @Override
    public void speak() {
        System.out.println("Wild dog speaks");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild dog moves");
    }
}
