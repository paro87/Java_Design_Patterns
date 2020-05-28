package com.paro.Behaviorial_Patterns.StrategyPattern.Type1;

public class Boat extends Vehicle{
    public Boat(){
        transportMedium=new WaterTransport();
    }

    @Override
    public void showMe() {
        System.out.println("Boat");
    }
}
