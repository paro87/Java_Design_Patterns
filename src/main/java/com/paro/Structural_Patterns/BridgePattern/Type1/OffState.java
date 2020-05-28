package com.paro.Structural_Patterns.BridgePattern.Type1;

//A concrete implementor
public class OffState implements State{
    @Override
    public void moveState() {
        System.out.println("Off State\n");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is Offline now. Do not press the off button again.\n");
    }
}
