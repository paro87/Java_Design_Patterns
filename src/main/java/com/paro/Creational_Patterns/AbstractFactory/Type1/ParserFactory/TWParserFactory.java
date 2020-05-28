package com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory;

import com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl.*;

public class TWParserFactory implements AbstractParserFactory{
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch(parserType){
            case "TWERROR": return new TWErrorXMLParser();
            case "TWFEEDBACK": return new TWFeedbackXMLParser();
            case "TWORDER": return new TWOrderXMLParser();
            case "TWRESPONSE": return new TWResponseXMLParser();
        }
        return null;
    }
}
