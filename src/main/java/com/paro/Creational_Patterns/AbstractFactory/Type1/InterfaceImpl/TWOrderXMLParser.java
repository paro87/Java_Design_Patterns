package com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl;

public class TWOrderXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("TW Parsing order XML...");
        return "TW Order XML Message";
    }
}
