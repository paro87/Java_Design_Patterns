package com.paro.Behaviorial_Patterns.CommandPattern.Type1;

public class CommandApp {
    public static void main(String[] args) {
        Receiver intendedReceiver=new Receiver();
        MyUndoCommand undoCommand=new MyUndoCommand(intendedReceiver);
        Invoker invoker=new Invoker();
        invoker.setCommandToBePerformed(undoCommand);
        invoker.invokeCommand();

        MyRedoCommand redoCommand=new MyRedoCommand(intendedReceiver);
        invoker.setCommandToBePerformed(redoCommand);
        invoker.invokeCommand();
    }
}
