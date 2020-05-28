package com.paro.Structural_Patterns.FlyweightPattern.Type1;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String, Robot> robotFactory=new HashMap<>();

    public int totalObjectsCreated() {
        return robotFactory.size();
    }

    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {
        Robot robotCategory=robotFactory.get(robotType);
        if (robotCategory==null) {
            switch (robotType) {
                case "small":
                    robotCategory=new SmallRobot();
                    break;
                case "large":
                    robotCategory=new LargeRobot();
                    break;
                case "fixed":
                    robotCategory=new FixedSizeRobot();
                    break;
                default:
                    throw new Exception();
            }
            robotFactory.put(robotType, robotCategory);
        }
        else {
            System.out.println("Using existing "+robotType);
        }
        return robotCategory;
    }
}
