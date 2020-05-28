package com.paro.Behaviorial_Patterns.MediatorPattern.Type2;

public interface Mediator {
    void register(Employee employee);
    void sendMessage(Employee fromEmployee, Employee toEmployee, String mgs) throws InterruptedException;
}
