package com.paro.Structural_Patterns.CompositePattern.Type1;

public class CompositeApp {
    public static void main(String[] args) {
        Employee mathTeacher1=new Employee("Math Teacher-1", "Maths");
        Employee mathTeacher2=new Employee("Math Teacher-2", "Maths");

        Employee cseTeacher1=new Employee("CSE Teacher-1", "Computer Sc.");
        Employee cseTeacher2=new Employee("CSE Teacher-2", "Computer Sc.");
        Employee cseTeacher3=new Employee("CSE Teacher-3", "Computer Sc.");

        CompositeEmployee hodMaths=new CompositeEmployee("Mrs.S.Das(HOD-Maths)","Maths");
        CompositeEmployee hodCompSc=new CompositeEmployee("Mrs.V.Sarcar(HOD-CSE)","Computer Sc.");

        CompositeEmployee principal=new CompositeEmployee("Dr.S.Som(Principal)", "Planning-Supervising-Managing");

        hodMaths.addEmployee(mathTeacher1);
        hodMaths.addEmployee(mathTeacher2);

        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);

        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCompSc);

        principal.printStructures();
        principal.getEmployeeCount();

        hodCompSc.printStructures();
        hodCompSc.getEmployeeCount();

        hodMaths.printStructures();
        hodMaths.getEmployeeCount();

        mathTeacher1.printStructures();
        mathTeacher1.getEmployeeCount();

        hodCompSc.removeEmployee(cseTeacher2);
        principal.printStructures();
        principal.getEmployeeCount();
        hodCompSc.getEmployeeCount();
        hodMaths.getEmployeeCount();
    }
}
