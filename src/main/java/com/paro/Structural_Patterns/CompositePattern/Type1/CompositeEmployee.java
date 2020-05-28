package com.paro.Structural_Patterns.CompositePattern.Type1;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee{
    private int employeeCount=0;
    private String name;
    private String department;
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String department) {
        this.name = name;
        this.department = department;
        controls=new ArrayList<>();
    }

    public void addEmployee(IEmployee e){
        controls.add(e);
    }

    public void removeEmployee(IEmployee e){
        controls.remove(e);
    }

    @Override
    public void printStructures() {
        System.out.println("\t"+this.name+" works in "+this.department);
        for(IEmployee e:controls){
            e.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
        employeeCount=controls.size();
        for (IEmployee e:controls) {
            employeeCount+=e.getEmployeeCount();
        }
        return employeeCount;
    }
}
