package com.paro.Creational_Patterns.AbstractFactory.Type1;

import com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory.AbstractParserFactory;
import com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory.NYParserFactory;
import com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory.TWParserFactory;

public class ParserFactoryProducer {
    private ParserFactoryProducer(){
        throw new AssertionError();
    }
    public static AbstractParserFactory getFactory(String factoryType){
        switch(factoryType)
        {
            case "NYFactory": return new NYParserFactory();
            case "TWFactory": return new TWParserFactory();
        }
        return null;
    }
}
