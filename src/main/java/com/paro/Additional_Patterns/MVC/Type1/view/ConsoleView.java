package com.paro.Additional_Patterns.MVC.Type1.view;

import com.paro.Additional_Patterns.MVC.Type1.model.Employee;

import java.util.List;

public class ConsoleView implements View{

    @Override
    public void showEnrolledEmployees(List<Employee> enrolledEmployees) {
        for (Employee employee: enrolledEmployees) {
            System.out.println(employee);
        }
    }
}
