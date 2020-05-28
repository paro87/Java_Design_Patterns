package com.paro.Behaviorial_Patterns.CommandPattern.Type1;

public class MyUndoCommand implements Command{
    private Receiver receiver;

    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToUndo();
        receiver.performUndo();
    }
}
