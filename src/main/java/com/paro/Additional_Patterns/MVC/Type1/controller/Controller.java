package com.paro.Additional_Patterns.MVC.Type1.controller;

import com.paro.Additional_Patterns.MVC.Type1.model.Employee;

public interface Controller {
    void displayEnrolledEmployees();
    void addEmployee(Employee employee);
    void removeEmployee(String employeeId);
}
