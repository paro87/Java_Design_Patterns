package com.paro.Structural_Patterns.ProxyPattern.Type1;

public class ConcreteSubject extends Subject{
    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() inside ConcreteSubject is invoked");
    }
}
