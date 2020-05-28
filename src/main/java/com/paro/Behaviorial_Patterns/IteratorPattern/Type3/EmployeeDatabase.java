package com.paro.Behaviorial_Patterns.IteratorPattern.Type3;

import java.util.LinkedList;

public class EmployeeDatabase implements DataBase{
    private LinkedList<Employee> employeesList;

    public EmployeeDatabase() {
        this.employeesList = new LinkedList<Employee>();
        employeesList.add(new Employee("Ron", 1, 1000.25));
        employeesList.add(new Employee("Jack", 2, 2000.5));
        employeesList.add(new Employee("Ambrose",3, 3000.75));
        employeesList.add(new Employee("Jian",4, 2550.0));
        employeesList.add(new Employee("Alex",5, 753.83));
    }

    @Override
    public EmployeeIterator createIterator() {
        return new EmployeeIterator(employeesList);
    }
}
