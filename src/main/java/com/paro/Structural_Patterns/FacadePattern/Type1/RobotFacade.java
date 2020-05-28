package com.paro.Structural_Patterns.FacadePattern.Type1;

public class RobotFacade {
    RobotColor robotColor;
    RobotHands robotHands;
    RobotBody robotBody;

    public RobotFacade() {
        robotColor=new RobotColor();
        robotHands=new RobotHands();
        robotBody=new RobotBody();
    }

    public void constructMilanoRobot() {
        RobotBody.createRobot();
        robotColor.setDefaultColor();
        robotHands.setMilanoHands();
        robotBody.createHands();
        robotBody.createRemainingParts();
    }

    public void constructRobonautRobot() {
        RobotBody.createRobot();
        System.out.println("Initiating the creational process of a Robonaut Robot.");
        robotColor.setGreenColor();
        robotHands.setRobonautHands();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("A Robonaut Robot is created.");
        System.out.println();
    }
    //Destroying a Milano Robot
    public void destroyMilanoRobot()
    {
        RobotBody.destroyRobot();
        System.out.println(" Milano Robot's destruction process is started.");
        robotHands.resetMilanoHands();
        robotBody.destroyHands();
        robotBody.destroyRemainingParts();
        System.out.println(" Milano Robot's destruction process is over.");
        System.out.println();
    }
    //Destroying a Robonaut Robot
    public void destroyRobonautRobot()
    {
        RobotBody.destroyRobot();
        System.out.println(" Initiating a Robonaut Robot's destruction process.");
        robotHands.resetRobonautHands();
        robotBody.destroyHands();
        robotBody.destroyRemainingParts();
        System.out.println(" A Robonaut Robot is destroyed.");
        System.out.println();
    }
}
