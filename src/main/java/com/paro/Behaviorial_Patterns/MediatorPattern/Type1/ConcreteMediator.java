package com.paro.Behaviorial_Patterns.MediatorPattern.Type1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    List<Employee> participants=new ArrayList<Employee>();
    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    public void displayRegisteredEmployees() {
        for (Employee employee:participants) {
            System.out.println(employee.getName());
        }
    }

    @Override
    public void sendMessage(Employee employee, String msg) throws InterruptedException {
        if(participants.contains(employee)){
            System.out.println(employee.getName() +" posts:"+ msg+"Last message posted at "+ LocalDateTime.now());
            Thread.sleep(1000);
        } else {
            System.out.println("An outsider named "+ employee.getName()+"is trying to send some messages.");
        }
    }
}
