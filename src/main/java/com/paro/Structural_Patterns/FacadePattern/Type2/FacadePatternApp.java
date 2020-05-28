package com.paro.Structural_Patterns.FacadePattern.Type2;

public class FacadePatternApp {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();
        System.out.println("Start working......");
        System.out.println("After work done.........");
        facadeServer.stopServer();
    }
}
