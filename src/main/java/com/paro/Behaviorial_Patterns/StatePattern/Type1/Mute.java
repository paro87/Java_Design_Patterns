package com.paro.Behaviorial_Patterns.StatePattern.Type1;

public class Mute implements PossibileState{
    @Override
    public void pressOnButton(TV context)
    {
        System.out.println("You pressed On button.Going from Mute mode to On state.");
                context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }
    //User is pressing Off button when the TV is in Mute mode
    @Override
    public void pressOffButton(TV context)
    {
        System.out.println("You pressed Off button. Going from Mute mode to Off state.");
                context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }
    //TV is in mute mode already, user is pressing mute button again
    @Override
    public void pressMuteButton(TV context)
    {
        System.out.println("You pressed Mute button.TV is already in Mute mode.");
    }

    public String toString()
    {
        return "\t**TV is silent(mute) now**";
    }
}
