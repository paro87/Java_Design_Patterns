package com.paro.Behaviorial_Patterns.VisitorPattern.Type2;

import lombok.Getter;

@Getter
public class SimpleEmployee implements Employee{
    private String name;
    private String department;
    private int yearsOfExperience;

    public SimpleEmployee(String name, String department, int yearsOfExperience) {
        this.name = name;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDepartment() + "Experience :" + getYearsOfExperience() + " years");
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
