package com.paro.Behaviorial_Patterns.StatePattern.Type1;

public interface PossibileState {
    void pressOnButton(TV context);
    void pressOffButton(TV context);
    void pressMuteButton(TV context);
}
