package com.paro.Behaviorial_Patterns.TemplatePattern.Type1;

public class TemplateApp {
    public static void main(String[] args) {
        BasicEngineering preferredCourse=new ComputerScience();
        preferredCourse.completeCourse();
        preferredCourse=new Electronics();
        preferredCourse.completeCourse();
    }
}
