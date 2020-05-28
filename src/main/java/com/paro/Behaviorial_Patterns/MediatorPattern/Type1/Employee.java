package com.paro.Behaviorial_Patterns.MediatorPattern.Type1;

import lombok.Getter;
import lombok.Setter;

abstract class Employee {
    protected Mediator mediator;
    @Getter
    @Setter
    protected String name;

    public Employee(Mediator mediator) {
        this.mediator=mediator;
    }

    public void sendMessage(String msg) throws InterruptedException{
        mediator.sendMessage(this, msg);
    }

    public abstract String employeeType();
}
