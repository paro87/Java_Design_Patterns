package com.paro.Behaviorial_Patterns.CommandPattern.Type1;

public class Invoker {
    private Command commandToBePerformed;

    public void setCommandToBePerformed(Command command){
        this.commandToBePerformed=command;
    }

    public void invokeCommand() {
        commandToBePerformed.executeCommand();
    }
}
