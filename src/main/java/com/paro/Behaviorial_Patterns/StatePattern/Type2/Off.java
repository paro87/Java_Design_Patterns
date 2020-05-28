package com.paro.Behaviorial_Patterns.StatePattern.Type2;

public class Off implements PossibleStates {
    TV context;

    public Off(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton() {
        context.setCurrentState(context.getOnState());

    }

    @Override
    public void pressOffButton() {
        System.out.println("TV is already in Off state");
    }

    @Override
    public void pressMuteButton() {
        System.out.println("TV is already off. So Mute operation will not work");
    }

    public String toString() {
        return "TV is switched off now.";
    }
}
