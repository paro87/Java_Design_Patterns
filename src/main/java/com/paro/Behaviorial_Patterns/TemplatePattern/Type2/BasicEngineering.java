package com.paro.Behaviorial_Patterns.TemplatePattern.Type2;

abstract class BasicEngineering {
    public final void completeCourse() {
        completeMath();
        completeSoftSkills();
        completeSpecialPaper();
        if(isAdditionalPapersNeeded()) {
            completeAdditionalPapers();
        }
    }

    private void completeMath() {
        System.out.println("1.Mathematics");
    }

    private void completeSoftSkills() {
        System.out.println("2.SoftSkills");
    }

    public abstract void completeSpecialPaper();

    private void completeAdditionalPapers() {
        System.out.println("4.Additional Papers are needed for this course");
    }

    boolean isAdditionalPapersNeeded() {
        return true;
    }
}
