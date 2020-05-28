package com.paro.Behaviorial_Patterns.StrategyPattern.Type1;

public class AirTransport implements TransportMedium{

    @Override
    public void transport() {
        System.out.println("Air transport");
    }
}
