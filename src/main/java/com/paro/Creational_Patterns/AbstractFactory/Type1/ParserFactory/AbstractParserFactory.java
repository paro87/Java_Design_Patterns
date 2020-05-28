package com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory;

import com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl.XMLParser;

public interface AbstractParserFactory {
    XMLParser getParserInstance(String parserType);
}
