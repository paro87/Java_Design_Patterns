package com.paro.Behaviorial_Patterns.VisitorPattern.Type2;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CompositeEmployee implements Employee{
    private String name;
    private String department;
    private final int yearsOfExperience;
    private List<Employee> controlledEmployees;

    public CompositeEmployee(String name, String department, int yearsOfExperience) {
        this.name = name;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        controlledEmployees=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        controlledEmployees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        controlledEmployees.remove(employee);
    }


    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDepartment() + "Experience :" + getYearsOfExperience() + " years");
        for(Employee employee: controlledEmployees){
            employee.printStructures();
        }
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
