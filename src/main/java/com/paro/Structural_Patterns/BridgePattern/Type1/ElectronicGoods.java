package com.paro.Structural_Patterns.BridgePattern.Type1;

//Abstraction
public abstract class ElectronicGoods {
    protected State state;
    //Alternative approach
    /*
    public ElectronicGoods(State state){
    this.state=state;
    }
    */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state=state;
    }

    public void moveToCurrentState(){
        state.moveState();
    }

    public void hardButtonPressed() {
        state.hardPressed();
    }
}
