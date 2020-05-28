package com.paro.Creational_Patterns.FactoryMethod.Type2Modified;

public class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("Rrrr");
    }

    @Override
    public void preferredAction() {
        System.out.println("Hunting");
    }
}
