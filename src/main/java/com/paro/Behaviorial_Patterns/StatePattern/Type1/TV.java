package com.paro.Behaviorial_Patterns.StatePattern.Type1;

import lombok.Getter;
import lombok.Setter;

public class TV {
    @Setter
    @Getter
    private PossibileState currentState;
    public TV() {
        this.setCurrentState(new Off());
    }

    public void pressOffButton(){
        currentState.pressOffButton(this);
    }

    public void pressOnButton() {
        currentState.pressOnButton(this);
    }

    public void pressMuteButton() {
        currentState.pressMuteButton(this);
    }

}
