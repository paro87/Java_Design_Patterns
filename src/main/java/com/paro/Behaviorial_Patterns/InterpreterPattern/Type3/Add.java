package com.paro.Behaviorial_Patterns.InterpreterPattern.Type3;

public class Add implements Expression{
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Add(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }


    @Override
    public int interpret() {
        return leftExpression.interpret()+rightExpression.interpret();
    }
}
