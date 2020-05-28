package com.paro.Additional_Patterns.MVC.Type1.view;

import com.paro.Additional_Patterns.MVC.Type1.model.Employee;

import java.util.List;

public interface View {
    void showEnrolledEmployees(List<Employee> enrolledEmployees);
}
