package com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl;

public class NYFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }
}
