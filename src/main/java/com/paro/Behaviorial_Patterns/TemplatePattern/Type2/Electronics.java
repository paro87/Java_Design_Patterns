package com.paro.Behaviorial_Patterns.TemplatePattern.Type2;

public class Electronics extends BasicEngineering {

    @Override
    public void completeSpecialPaper() {
        System.out.println("3.Digital Logic and Circuit Theory");
    }

    @Override
    boolean isAdditionalPapersNeeded() {
        return false;
    }
}
