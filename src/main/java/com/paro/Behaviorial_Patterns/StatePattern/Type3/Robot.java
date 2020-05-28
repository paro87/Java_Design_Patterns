package com.paro.Behaviorial_Patterns.StatePattern.Type3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Robot implements RoboticState{
    private RoboticState roboticOn;
    private RoboticState roboticCook;
    private RoboticState roboticOff;
    private RoboticState state;
    private RoboticState roboticStandby;
    public Robot(){
        this.roboticOn = new RoboticOn(this);
        this.roboticCook = new RoboticCook(this);
        this.roboticOff = new RoboticOff(this);
        this.roboticStandby=new RoboticStandby(this);
        this.state = roboticOn;
    }
    public void setRoboticState(RoboticState state){
        this.state = state;
    }
    @Override
    public void walk() {
        state.walk();
        setState(getRoboticStandby());
    }
    @Override
    public void cook() {
        state.cook();
        setState(getRoboticStandby());
    }
    @Override
    public void off() {
        state.off();
    }
}
