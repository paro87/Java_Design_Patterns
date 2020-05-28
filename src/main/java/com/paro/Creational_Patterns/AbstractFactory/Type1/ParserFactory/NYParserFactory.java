package com.paro.Creational_Patterns.AbstractFactory.Type1.ParserFactory;

import com.paro.Creational_Patterns.AbstractFactory.Type1.InterfaceImpl.*;


public class NYParserFactory implements AbstractParserFactory{

    @Override
    public XMLParser getParserInstance(String parserType) {
        switch(parserType){
            case "NYERROR": return new NYErrorXMLParser();
            case "NYFEEDBACK": return new NYFeedbackXMLParser();
            case "NYORDER": return new NYOrderXMLParser();
            case "NYRESPONSE": return new NYResponseXMLParser();
        }
        return null;
    }
}
