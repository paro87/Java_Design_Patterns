package com.paro.Additional_Patterns.SimpleFactoryPattern;

public class Tiger implements Animal{

    @Override
    public void speak() {
        System.out.println("Rrrr");
    }

    @Override
    public void preferredAction() {
        System.out.println("Hunting");
    }
}
