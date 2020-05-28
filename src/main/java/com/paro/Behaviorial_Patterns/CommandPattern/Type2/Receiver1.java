package com.paro.Behaviorial_Patterns.CommandPattern.Type2;

import lombok.Getter;
import lombok.Setter;

public class Receiver1 implements Receiver{
    @Getter
    @Setter
    private int myNumber;

    public Receiver1() {
        myNumber=10;
    }

    @Override
    public void performDo() {
        int presentNumer=getMyNumber();
        setMyNumber(presentNumer+2);
    }

    @Override
    public void performUndo() {
        int presentNumber=this.myNumber;
        if (presentNumber>10){
            setMyNumber(this.myNumber-2);
        }else {
            System.out.println("Nothing more to undo...");
        }

    }
}
