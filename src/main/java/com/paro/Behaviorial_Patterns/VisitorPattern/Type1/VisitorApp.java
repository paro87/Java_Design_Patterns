package com.paro.Behaviorial_Patterns.VisitorPattern.Type1;

public class VisitorApp {
    public static void main(String[] args) {
        Visitor visitor=new ConcreteVisitor();
        MyClass myClass=new MyClass();
        myClass.acceptVisitor(visitor);
    }

}
