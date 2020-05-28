package com.paro.Behaviorial_Patterns.CommandPattern.Type2;

public class Receiver2 implements Receiver{
    boolean status;

    public Receiver2() {
        status=false;
    }

    @Override
    public void performDo() {
        if (status==false) {
            status=true;
        } else {
            System.out.println("System is already running");
        }
    }

    @Override
    public void performUndo() {
        if (status==true) {
            status=false;
        } else {
            status=true;
        }
    }
}
