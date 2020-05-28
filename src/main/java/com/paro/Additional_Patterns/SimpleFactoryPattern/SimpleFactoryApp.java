package com.paro.Additional_Patterns.SimpleFactoryPattern;



public class SimpleFactoryApp {
    public static void main(String[] args) {
        Animal preferredType=null;
        Factory factory=new Factory();
        preferredType=factory.createAnimal();
        preferredType.speak();
        preferredType.preferredAction();
    }
}
