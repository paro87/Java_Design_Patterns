package com.paro.Creational_Patterns.FactoryMethod.Type1.AbstractClassImpl;

import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.FeedBackXMLParser;
import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.XMLParser;

public class FeedbackXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new FeedBackXMLParser();
    }
}
