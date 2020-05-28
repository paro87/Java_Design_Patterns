package com.paro.Behaviorial_Patterns.InterpreterPattern.Type3;

public class Number implements Expression{
    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
