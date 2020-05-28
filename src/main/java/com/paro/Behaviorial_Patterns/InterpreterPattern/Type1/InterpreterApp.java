package com.paro.Behaviorial_Patterns.InterpreterPattern.Type1;

public class InterpreterApp {
    public static void main(String[] args) {
        Context context=new Context(10,"G2","G3");
        //Different employees with grades
        Employee emp1 = new IndividualEmployee(5,"G1");
        Employee emp2 = new IndividualEmployee(10,"G2");
        Employee emp3 = new IndividualEmployee(15,"G3");
        Employee emp4 = new IndividualEmployee(20,"G4");
        EmployeeBuilder builder=new EmployeeBuilder();

        System.out.println("emp1 is eligible for promotion. " + emp1.interpret(context));
        System.out.println("emp2 is eligible for promotion. " + emp2.interpret(context));
        System.out.println("emp3 is eligible for promotion. " + emp3.interpret(context));
        System.out.println("emp4 is eligible for promotion. " + emp4.interpret(context));
        System.out.println("Is either emp1 or emp3 is eligible for promotion?" +builder.buildExpression(emp1,"Or",emp3).
        interpret(context));
        System.out.println("Is both emp2 and emp4 are eligible for promotion? ?" + builder.buildExpression(emp2,"And",emp4).
        interpret(context));
        System.out.println("The statement 'emp3 is NOT eligible for promotion' is true? " + builder.buildExpression(emp3, "Not",null).
        interpret(context));
        //Invalid input expression
        //System.out.println("Is either emp1 or emp3 is eligible for promotion?" +builder.buildExpression(emp1,"Wrong",emp3).interpret(context));
    }
}
