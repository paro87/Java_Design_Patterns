package com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl;

public class NYErrorXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("NY Parsing error XML...");
        return "NY Error XML Message";
    }
}
