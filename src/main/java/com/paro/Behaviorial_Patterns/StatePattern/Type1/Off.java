package com.paro.Behaviorial_Patterns.StatePattern.Type1;

public class Off implements PossibileState {
    @Override
    public void pressOnButton(TV context) {
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("TV is already in Off state");
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("TV is already off. So Mute operation will not work");
    }

    public String toString() {
        return "TV is switched off now.";
    }
}
