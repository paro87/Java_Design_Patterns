package com.paro.Behaviorial_Patterns.ObserverPattern.Type1;

public class Observer1 implements ObserverInterface {
    String nameOfObserver;
    public Observer1(String name) {
        this.nameOfObserver=name;
    }
    @Override
    public void update(int updatedValue) {
        System.out.println(nameOfObserver+ ": Updated value is: "+updatedValue);
    }
}
