package com.paro.Behaviorial_Patterns.StatePattern.Type2;

import lombok.Getter;
import lombok.Setter;

public class TV {

    private PossibleStates currentState;
    private PossibleStates onState;
    private PossibleStates offState;
    private PossibleStates muteState;
    public TV()
    {
        onState=new On(this);
        offState=new Off(this);
        muteState=new Mute(this);
        setCurrentState(offState);
    }

    public PossibleStates getCurrentState()
    {
        return currentState;
    }
    public void setCurrentState(PossibleStates currentState)
    {
        this.currentState = currentState;
    }
    public void pressOffButton()
    {
        currentState.pressOffButton();
    }
    public void pressOnButton()
    {
        currentState.pressOnButton();
    }
    public void pressMuteButton()
    {
        currentState.pressMuteButton();
    }
    public PossibleStates getOnState()
    {
        return onState;
    }
    public PossibleStates getOffState()
    {
        return offState;
    }
    public PossibleStates getMuteState()
    {
        return muteState;
    }

}
