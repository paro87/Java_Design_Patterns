package com.paro.Structural_Patterns.FlyweightPattern.Type1;

import java.util.Random;

public class FlyweightPatternApp {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory=new RobotFactory();
        Robot myRobot;

        for (int i = 0; i <3; i++) {
            myRobot=RobotFactory.getRobotFromFactory("small");
            Thread.sleep(1000);
            myRobot.showMe(getRandomColor());
        }
        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);

        for (int i = 0; i < 5; i++){
            myRobot = RobotFactory.getRobotFromFactory("large");
            Thread.sleep(1000);
            myRobot.showMe(getRandomColor());
        }
        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);

        for (int i = 0; i < 4; i++){
            myRobot = RobotFactory.getRobotFromFactory("fixed");
            Thread.sleep(1000);
            myRobot.showMe(getRandomColor());
        }
        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
    }
    static String getRandomColor(){
        Random r = new Random();
        int random = r.nextInt();
        if (random % 2 == 0){
            return "red";
        }
        else{
            return "green";
        }

    }
}
