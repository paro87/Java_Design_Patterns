package com.paro.Creational_Patterns.AbstractFactory.Type1;

import com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl.XMLParser;
import com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory.AbstractParserFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory(" NYFactory");
        XMLParser parser = parserFactory.getParserInstance("NYORDER");
        String msg="";
        msg = parser.parse();
        System.out.println(msg);

        System.out.println("************************************");

        parserFactory = ParserFactoryProducer.getFactory("TWFactory");
        parser = parserFactory.getParserInstance("TWFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
    }
}
