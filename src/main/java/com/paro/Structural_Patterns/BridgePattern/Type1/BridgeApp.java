package com.paro.Structural_Patterns.BridgePattern.Type1;

public class BridgeApp {
    public static void main(String[] args) {
        State presentState=new OnState();
        ElectronicGoods eItem=new Television();

        eItem.setState(presentState);
        eItem.moveToCurrentState();
        eItem.hardButtonPressed();

        presentState=new OffState();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState=new OnState();
        eItem=new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState=new OffState();
        eItem=new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        ((DVD)eItem).doublePress();
    }

}
