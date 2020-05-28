package com.paro.Behaviorial_Patterns.MediatorPattern.Type1;

public interface Mediator {
    void register(Employee employee);
    void sendMessage(Employee employee, String msg) throws InterruptedException;
}
