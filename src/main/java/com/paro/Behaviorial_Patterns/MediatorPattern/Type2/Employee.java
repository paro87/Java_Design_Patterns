package com.paro.Behaviorial_Patterns.MediatorPattern.Type2;

abstract class Employee
{
    private Mediator mediator;
    protected String name;
    private boolean authorizedUser;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Constructor
    public Employee(Mediator mediator, String name, boolean authorizedUser)
    {
        this.mediator = mediator;
        this.name=name;
        this.authorizedUser=authorizedUser;
        if(authorizedUser)
        {
            mediator.register(this);
        }
    }
    //The following method name need not be same as the Mediator's method name
    public void send(Employee toFriend,String msg) throws
            InterruptedException
    {
        mediator.sendMessage(this, toFriend, msg);
    }
    //public abstract void receive(Friend fromFriend,String message);
    public void receive(Employee fromFriend,String message)
    {
        System.out.println(this.name+" received a message : " + message +"from an employee "+ fromFriend.getName() +".");
    }
    public abstract String employeeType();
}
