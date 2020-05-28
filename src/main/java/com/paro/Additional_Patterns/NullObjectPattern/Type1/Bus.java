package com.paro.Additional_Patterns.NullObjectPattern.Type1;

public class Bus implements Vehicle{
    public static int busCount=0;
    public Bus() {
        busCount++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel with a bus");
    }
}
