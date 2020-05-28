package com.paro.Behaviorial_Patterns.CommandPattern.Type1;

public class MyRedoCommand implements Command{
    private Receiver receiver;

    public MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToRedo();
        receiver.performRedo();
    }
}
