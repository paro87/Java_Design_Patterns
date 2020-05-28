package com.paro.Behaviorial_Patterns.StrategyPattern.Type1;

public class WaterTransport implements TransportMedium{

    @Override
    public void transport() {
        System.out.println("Water transport");
    }
}
