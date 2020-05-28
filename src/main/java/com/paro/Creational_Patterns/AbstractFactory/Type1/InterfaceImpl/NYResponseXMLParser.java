package com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl;

public class NYResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");
        return "NY Response XML Message";
    }
}
