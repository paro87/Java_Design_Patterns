package com.paro.Behaviorial_Patterns.VisitorPattern.Type2;

public interface Visitor {
    void visitTheElement(CompositeEmployee employees);
    void visitTheElement(SimpleEmployee employee);
}
