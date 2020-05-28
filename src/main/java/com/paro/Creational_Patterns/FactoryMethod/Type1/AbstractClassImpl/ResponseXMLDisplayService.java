package com.paro.Creational_Patterns.FactoryMethod.Type1.AbstractClassImpl;

import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.ResponseXMLParser;
import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.XMLParser;

public class ResponseXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
