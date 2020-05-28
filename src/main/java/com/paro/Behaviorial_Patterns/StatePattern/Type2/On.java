package com.paro.Behaviorial_Patterns.StatePattern.Type2;

public class On implements PossibleStates {
    TV context;

    public On(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton()
    {
        System.out.println("You pressed On button. TV is already in On state.");
    }
    //User is pressing Off button when the TV is in On state
    @Override
    public void pressOffButton()
    {
        context.setCurrentState(context.getOffState());

    }
    //User is pressing Mute button when the TV is in On state
    @Override
    public void pressMuteButton()
    {
        System.out.println("You pressed Mute button.Going from On to Mute mode.");
        context.setCurrentState(context.getMuteState());

    }
}
