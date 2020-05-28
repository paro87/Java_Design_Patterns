package com.paro.Additional_Patterns.MVC.Type1.controller;

import com.paro.Additional_Patterns.MVC.Type1.model.Employee;
import com.paro.Additional_Patterns.MVC.Type1.model.Model;
import com.paro.Additional_Patterns.MVC.Type1.view.View;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class EmployeeController implements Controller{
    private Model model;
    private View view;
    @Override
    public void displayEnrolledEmployees() {
        List<Employee> enrolledEmployees=model.getEnrolledEmployeeDetailsFromModel();
        view.showEnrolledEmployees(enrolledEmployees);

    }

    @Override
    public void addEmployee(Employee employee) {
        model.addEmployeeToModel(employee);
    }

    @Override
    public void removeEmployee(String employeeId) {
        model.removeEmployeeFromModel(employeeId);
    }
}
