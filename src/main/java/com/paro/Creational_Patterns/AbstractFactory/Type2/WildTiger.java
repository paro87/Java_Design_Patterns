package com.paro.Creational_Patterns.AbstractFactory.Type2;

public class WildTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Wild tiger speaks");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild tiger moves");
    }
}
