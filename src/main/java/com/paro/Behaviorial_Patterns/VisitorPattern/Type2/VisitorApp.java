package com.paro.Behaviorial_Patterns.VisitorPattern.Type2;

import java.util.ArrayList;
import java.util.List;

public class VisitorApp {
    public static void main(String[] args) {
        System.out.println("***Visitor Pattern combined with Composite Pattern Demo***\n");
        SimpleEmployee mathTeacher1 = new SimpleEmployee("Math Teacher-1","Maths",13);
        SimpleEmployee mathTeacher2 = new SimpleEmployee("Math Teacher-2","Maths",6);
        SimpleEmployee cseTeacher1 = new SimpleEmployee("CSE Teacher-1","Computer Sc.",10);
        SimpleEmployee cseTeacher2 = new SimpleEmployee("CSE Teacher-2","Computer Sc.",13);
        SimpleEmployee cseTeacher3 = new SimpleEmployee("CSE Teacher-3","Computer Sc.",7);
        CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HODMaths)","Maths",14);
        CompositeEmployee hodCompSc = new CompositeEmployee("Mr.V.Sarcar(HOD-CSE)", "Computer Sc.",16);
        CompositeEmployee principal = new CompositeEmployee("Dr.S.Som(Principal)","Planning-Supervising-Managing",20);

        hodMaths.addEmployee(mathTeacher1);
        hodMaths.addEmployee(mathTeacher2);

        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);

        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCompSc);
        System.out.println("\n Testing the overall structure");

        principal.printStructures();
        System.out.println("\n***Visitor starts visiting our composite structure***\n");
        System.out.println("---The minimum criteria for promotion is as follows ---");
        System.out.println("--Junior Teachers-12 years and Senior teachers-15 years.--\n");
        Visitor myVisitor = new ConcreteVisitor();
        List<Employee> employeeContainer= new ArrayList<Employee>();

        for (Employee e : principal.getControlledEmployees()){
            employeeContainer.add(e);
        }

        for (Employee e : hodMaths.getControlledEmployees()){
            employeeContainer.add(e);
        }

        for (Employee e : hodCompSc.getControlledEmployees()){
            employeeContainer.add(e);
        }

        for (Employee e :employeeContainer){
            e.acceptVisitor(myVisitor);
        }
    }
}
