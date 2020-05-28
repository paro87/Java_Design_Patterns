package com.paro.Structural_Patterns.FlyweightPattern.Type1;

public class LargeRobot implements Robot{
    private final String roboyTypeCreated;
    public LargeRobot() {
        roboyTypeCreated="A large robot created";
        System.out.println(roboyTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with "+color+" color");
    }
}
