package com.paro.Creational_Patterns.FactoryMethod.Type1.AbstractClassImpl;

import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.OrderXMLParser;
import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.XMLParser;

public class OrderXMLDisplayService extends DisplayService{
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
