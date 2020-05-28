package com.paro.Behaviorial_Patterns.CommandPattern.Type2;

public class CommandApp {
    public static void main(String[] args) {
        Receiver intendedReceiver=new Receiver1();
        Command currentCommand=new AdditionCommand(intendedReceiver);

        Invoker invoker=new Invoker();
        invoker.setCommand(currentCommand);

        invoker.executeCommand();
        invoker.undoCommand();

        invoker.executeCommand();
        invoker.executeCommand();

        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();

        intendedReceiver=new Receiver2();
        currentCommand=new PowerCommand(intendedReceiver);
        invoker.setCommand(currentCommand);

        invoker.executeCommand();
        invoker.undoCommand();

        invoker.executeCommand();
        invoker.executeCommand();

        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();

    }
}
