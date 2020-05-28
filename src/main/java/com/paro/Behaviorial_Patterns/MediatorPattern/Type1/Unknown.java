package com.paro.Behaviorial_Patterns.MediatorPattern.Type1;

public class Unknown extends Employee{


    public Unknown(Mediator mediator, String name) {
        super(mediator);
        this.name=name;
    }

    @Override
    public String employeeType() {
        return null;
    }
}
