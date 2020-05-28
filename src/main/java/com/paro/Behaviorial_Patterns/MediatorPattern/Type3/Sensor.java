package com.paro.Behaviorial_Patterns.MediatorPattern.Type3;

public class Sensor {
    public boolean checkTemperature(int temp){
        System.out.println("Temperature reached "+temp+" *C");
        return true;
    }
}
