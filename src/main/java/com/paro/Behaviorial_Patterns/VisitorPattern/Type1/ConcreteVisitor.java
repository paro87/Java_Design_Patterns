package com.paro.Behaviorial_Patterns.VisitorPattern.Type1;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(MyClass myClassObject) {
        System.out.println(2*myClassObject.getMyInt());
    }
}
