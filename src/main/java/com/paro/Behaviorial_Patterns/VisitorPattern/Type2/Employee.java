package com.paro.Behaviorial_Patterns.VisitorPattern.Type2;


public interface Employee {
    void printStructures();
    void acceptVisitor(Visitor visitor);
}
