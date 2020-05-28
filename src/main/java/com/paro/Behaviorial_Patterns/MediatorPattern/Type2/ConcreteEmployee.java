package com.paro.Behaviorial_Patterns.MediatorPattern.Type2;

class ConcreteEmployee extends Employee
{
    public ConcreteEmployee(Mediator mediator, String name,boolean
            authorizedUser)
    {
        super(mediator,name, authorizedUser);
    }
    @Override
    public String employeeType()
    {
        return "ConcreteEmployee";
    }
}
