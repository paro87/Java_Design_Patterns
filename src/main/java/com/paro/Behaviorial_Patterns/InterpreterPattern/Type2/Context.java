package com.paro.Behaviorial_Patterns.InterpreterPattern.Type2;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private int yearOfExperience;
    private List<String> permissibleGrades;

    public Context(int yearOfExperience, String... allowedGrades) {
        this.yearOfExperience = yearOfExperience;
        this.permissibleGrades = new ArrayList<>();
        for (String grade:allowedGrades) {
            permissibleGrades.add(grade);
        }
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public List<String> getPermissibleGrades() {
        return permissibleGrades;
    }
}
