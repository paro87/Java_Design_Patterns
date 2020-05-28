package com.paro.Behaviorial_Patterns.IteratorPattern.Type3;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeIterator implements Iterator<Employee> {
    private LinkedList<Employee> employeesList;
    private int position;

    public EmployeeIterator(LinkedList<Employee> employeesList) {
        this.employeesList=employeesList;
        position=0;
    }

    public void first(){
        position=0;
    }

    public Employee currentItem() {
        return employeesList.get(position);
    }

    @Override
    public boolean hasNext() {
        if(position>=employeesList.size())
            return false;
        return true;
    }

    @Override
    public Employee next() {
        return employeesList.get(position++);
    }

    @Override
    public void remove() {

    }
}
