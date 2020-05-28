package com.paro.Behaviorial_Patterns.VisitorPattern.Type1;

public class MyClass implements OriginalInterface{
    private final int myInt;
    public MyClass() {
        myInt=5;
    }

    public int getMyInt() {
        return myInt;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
