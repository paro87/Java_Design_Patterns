package com.paro.Behaviorial_Patterns.StatePattern.Type2;

public class Mute implements PossibleStates {
    TV context;

    public Mute(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton()
    {
        System.out.println("You pressed On button.Going from Mute mode to On state.");
                context.setCurrentState(context.getOnState());

    }
    //User is pressing Off button when the TV is in Mute mode
    @Override
    public void pressOffButton()
    {
        System.out.println("You pressed Off button. Going from Mute mode to Off state.");
                context.setCurrentState(context.getOffState());

    }
    //TV is in mute mode already, user is pressing mute button again
    @Override
    public void pressMuteButton()
    {
        System.out.println("You pressed Mute button.TV is already in Mute mode.");
    }

    public String toString()
    {
        return "\t**TV is silent(mute) now**";
    }
}
