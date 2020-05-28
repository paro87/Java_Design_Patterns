package com.paro.Behaviorial_Patterns.StrategyPattern.Type1;

public class Aeroplane extends Vehicle{
    public Aeroplane() {
        transportMedium=new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("Aeroplane");
    }
}
