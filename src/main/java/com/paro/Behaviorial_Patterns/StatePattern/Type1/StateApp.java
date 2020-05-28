package com.paro.Behaviorial_Patterns.StatePattern.Type1;

public class StateApp {
    public static void main(String[] args) {
        TV tv=new TV();
        tv.pressOffButton();
        tv.pressMuteButton();
        tv.pressOnButton();
        tv.pressOnButton();
        tv.pressMuteButton();
        tv.pressMuteButton();
        tv.pressOffButton();
    }
}
