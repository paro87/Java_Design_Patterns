package com.paro.Structural_Patterns.FacadePattern.Type1;

public class FacadePatternApp {
    public static void main(String[] args) {
        RobotFacade milanoRobotFacade=new RobotFacade();
        milanoRobotFacade.constructMilanoRobot();

        RobotFacade robonautRobotFacade=new RobotFacade();
        robonautRobotFacade.constructRobonautRobot();

        milanoRobotFacade.destroyMilanoRobot();
        robonautRobotFacade.destroyRobonautRobot();
    }
}
