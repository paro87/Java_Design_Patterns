package com.paro.Creational_Patterns.FactoryMethod.Type1;

import com.paro.Creational_Patterns.FactoryMethod.Type1.AbstractClassImpl.*;

public class FactoryMethodApp {
    public static void main(String[] args) {
        DisplayService service=new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();
    }

}
