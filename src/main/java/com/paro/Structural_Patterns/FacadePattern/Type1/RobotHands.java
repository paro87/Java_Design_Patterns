package com.paro.Structural_Patterns.FacadePattern.Type1;

public class RobotHands {
    public void setMilanoHands() {
        System.out.println("The robot will have EH1 Milano hands");
    }

    public void setRobonautHands() {
        System.out.println("The robot will have Robonaut hands");
    }

    public void resetMilanoHands() {
        System.out.println("EH1 Milano hands are about t be destroyed.");
    }

    public void resetRobonautHands() {
        System.out.println("Robonaut hands are about to be destroyed.");
    }
}
