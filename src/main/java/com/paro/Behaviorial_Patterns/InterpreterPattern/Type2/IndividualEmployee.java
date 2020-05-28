package com.paro.Behaviorial_Patterns.InterpreterPattern.Type2;

public class IndividualEmployee implements Employee {
    private int yearOfExperience;
    private String currentGrade;

    public IndividualEmployee(int yearOfExperience, String currentGrade) {
        this.yearOfExperience = yearOfExperience;
        this.currentGrade = currentGrade;
    }

    @Override
    public boolean interpret(Context context) {
        if(this.yearOfExperience>=context.getYearOfExperience()&&context.getPermissibleGrades().contains(this.currentGrade))
            return true;
        return false;
    }
}
