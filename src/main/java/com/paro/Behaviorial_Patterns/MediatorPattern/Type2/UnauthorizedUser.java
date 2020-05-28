package com.paro.Behaviorial_Patterns.MediatorPattern.Type2;

class UnauthorizedUser extends Employee
{
    public UnauthorizedUser(Mediator mediator, String name)
    {
    //The user is always treated an unauthorized user.So, the flag is false always.
        super(mediator,name, false);
    }
    @Override
    public void receive(Employee fromEmployee,String message)
    {
        System.out.println(this.name + message);
    }
    @Override
    public String employeeType()
    {
        return "UnauthorizedUser";
    }
}
