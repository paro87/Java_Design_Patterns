package com.paro.Behaviorial_Patterns.StatePattern.Type1;

public class On implements PossibileState {
    @Override
    public void pressOnButton(TV context)
    {
        System.out.println("You pressed On button. TV is already in On state.");
    }
    //User is pressing Off button when the TV is in On state
    @Override
    public void pressOffButton(TV context)
    {
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }
    //User is pressing Mute button when the TV is in On state
    @Override
    public void pressMuteButton(TV context)
    {
        System.out.println("You pressed Mute button.Going from On to Mute mode.");
        context.setCurrentState(new Mute());
        System.out.println(context.getCurrentState().toString());
    }
}
