package com.paro.Behaviorial_Patterns.StrategyPattern.Type1;

public class StrategyApp {
    public static void main(String[] args) {
        Vehicle vehicleContext=new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();

        vehicleContext=new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
    }
}
