package com.paro.Behaviorial_Patterns.IteratorPattern.Type3;

public class IteratorApp {
    public static void main(String[] args) {
        DataBase employeesList=new EmployeeDatabase();
        EmployeeIterator employeeIterator=employeesList.createIterator();
        while (employeeIterator.hasNext())
            System.out.println(employeeIterator.next());
    }
}
