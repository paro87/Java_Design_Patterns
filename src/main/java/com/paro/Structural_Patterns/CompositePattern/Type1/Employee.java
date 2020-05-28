package com.paro.Structural_Patterns.CompositePattern.Type1;

public class Employee implements IEmployee{
    private String name;
    private String department;
    private int employeeCount=0;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t"+this.name+" works in "+this.department);
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }
}
