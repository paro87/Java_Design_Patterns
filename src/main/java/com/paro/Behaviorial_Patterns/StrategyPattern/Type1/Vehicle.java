package com.paro.Behaviorial_Patterns.StrategyPattern.Type1;

//Context
public abstract class Vehicle {
    TransportMedium transportMedium;
    public Vehicle(){

    }
    public void showTransportMedium() {
        transportMedium.transport();
    }

    public void commonJob() {
        System.out.println("We all can be used to transport");
    }

    public abstract void showMe();
}
