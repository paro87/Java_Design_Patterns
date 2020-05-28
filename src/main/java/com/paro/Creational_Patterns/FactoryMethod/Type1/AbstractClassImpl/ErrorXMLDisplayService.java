package com.paro.Creational_Patterns.FactoryMethod.Type1.AbstractClassImpl;

import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.ErrorXMLParser;
import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.XMLParser;

public class ErrorXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
