package com.paro.Additional_Patterns.MVC.Type1;

import com.paro.Additional_Patterns.MVC.Type1.controller.Controller;
import com.paro.Additional_Patterns.MVC.Type1.controller.EmployeeController;
import com.paro.Additional_Patterns.MVC.Type1.model.Employee;
import com.paro.Additional_Patterns.MVC.Type1.model.EmployeeModel;
import com.paro.Additional_Patterns.MVC.Type1.model.Model;
import com.paro.Additional_Patterns.MVC.Type1.view.ConsoleView;
import com.paro.Additional_Patterns.MVC.Type1.view.View;

public class MVCApp {
    public static void main(String[] args) {
        Model model=new EmployeeModel();
        View view=new ConsoleView();
        Controller controller=new EmployeeController(model, view);
        controller.displayEnrolledEmployees();
        controller.removeEmployee("E2");
        controller.displayEnrolledEmployees();
        controller.removeEmployee("E5");
        controller.displayEnrolledEmployees();

        controller.addEmployee(new Employee("Kevin", "E4"));
    }
}
