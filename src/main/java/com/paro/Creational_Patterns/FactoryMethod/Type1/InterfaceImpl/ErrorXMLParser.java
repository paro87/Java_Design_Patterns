package com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl;

public class ErrorXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing error XML...");
        return "Error XML message";
    }
}
