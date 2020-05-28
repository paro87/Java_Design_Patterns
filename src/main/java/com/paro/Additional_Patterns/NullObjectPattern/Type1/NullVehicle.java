package com.paro.Additional_Patterns.NullObjectPattern.Type1;

public class NullVehicle implements Vehicle{
    private static NullVehicle instance=new NullVehicle();
    public static int nullVehicleCount;
    private NullVehicle(){
        nullVehicleCount++;
        System.out.println(" A null vehicle object created.Currently null vehicle count is : "+nullVehicleCount);
    }
    // Global point of access.
    public static NullVehicle getInstance(){
        //System.out.println("We already have an instance now. Use it.");
        return instance;
    }
    @Override
    public void travel() {
        //Do Nothing
    }
}
