package com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl;

public class NYOrderXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");
        return "NY Order XML Message";
    }
}
