package com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl;

public class ResponseXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML message";
    }
}
