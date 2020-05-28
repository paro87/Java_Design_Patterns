package com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl;

public class FeedBackXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML message";
    }
}
