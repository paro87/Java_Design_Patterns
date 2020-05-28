package com.paro.Behaviorial_Patterns.InterpreterPattern.Type1;

public class NotExpression implements Employee{
    private Employee employee;

    public NotExpression(Employee employee) {
        this.employee = employee;
    }


    @Override
    public boolean interpret(Context context) {
        return !employee.interpret(context);
    }
}
