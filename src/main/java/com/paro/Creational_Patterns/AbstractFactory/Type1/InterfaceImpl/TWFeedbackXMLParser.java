package com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl;

public class TWFeedbackXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");
        return "TW Feedback XML Message";
    }
}
