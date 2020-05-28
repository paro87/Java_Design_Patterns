package com.paro.Structural_Patterns.BridgePattern.Type1;

//A concrete implementor
public class OnState implements State{
    @Override
    public void moveState() {
        System.out.println("On state\n");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is already On. Do not press the button so hard.\n");
    }
}
