package com.paro.Behaviorial_Patterns.MediatorPattern.Type1;

public class JuniorEmployee extends Employee{
    public JuniorEmployee(Mediator mediator, String name) {
        super(mediator);
        this.name=name;
    }

    @Override
    public String employeeType() {
        return "JuniorEmployee";
    }
}
