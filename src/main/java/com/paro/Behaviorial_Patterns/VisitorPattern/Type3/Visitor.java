package com.paro.Behaviorial_Patterns.VisitorPattern.Type3;

public interface Visitor {
    void visit(HtmlElement element);
    void visit(HtmlParentElement parentElement);
}
