package com.paro.Creational_Patterns.FactoryMethod.Type1.AbstractClassImpl;

import com.paro.Creational_Patterns.FactoryMethod.Type1.InterfaceImpl.XMLParser;

public abstract class DisplayService {
    public void display() {
        XMLParser parser=getParser();
        String msg=parser.parse();
        System.out.println(msg);
    }
    //Factory method
    protected abstract XMLParser getParser();
}
