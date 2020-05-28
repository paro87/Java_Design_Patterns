package com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl;

public class OrderXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing order XML...");
        return "Order XML message";
    }
}
