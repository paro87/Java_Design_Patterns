package com.paro.Additional_Patterns.MVC.Type1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeModel implements Model{
    List<Employee> enrolledEmployees;

    public EmployeeModel() {
        enrolledEmployees=new ArrayList<>();
        enrolledEmployees.add(new Employee("Amit", "E1"));
        enrolledEmployees.add(new Employee("John", "E2"));
        enrolledEmployees.add(new Employee("Sam", "E3"));
    }

    public List<Employee> getEnrolledEmployeeDetailsFromModel() {
        return enrolledEmployees;
    }


    @Override
    public void addEmployeeToModel(Employee employee) {
        System.out.println("\nTrying to add an employee to the registered list.");
        if( !enrolledEmployees.contains(employee)){
            enrolledEmployees.add(employee);
            System.out.println(employee+" [added recently.]");
        }else {
            System.out.println(employee+" is already added in the system.");
        }
    }
    //Removing an employee from model(student list)
    @Override
    public void removeEmployeeFromModel(String employeeId) {
        boolean flag = false;
        ListIterator<Employee> employeeIterator = enrolledEmployees.listIterator();
        System.out.println("\nTrying to remove an employee from the registered list.");
        while (employeeIterator.hasNext()) {
            Employee removableEmployee = ((Employee) employeeIterator.next());
            if (removableEmployee.getEmployeeId().equals(employeeId)) {
                employeeIterator.remove();
                System.out.println("Employee " + removableEmployee.getEmployeeName() + " with id " + employeeId + " is removed now.");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("###Employee Id " + employeeId + " Not found.###");
        }
    }
}
