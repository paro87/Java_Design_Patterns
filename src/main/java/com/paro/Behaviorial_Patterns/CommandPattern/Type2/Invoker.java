package com.paro.Behaviorial_Patterns.CommandPattern.Type2;

import lombok.Setter;

public class Invoker {
    @Setter
    Command command;

    public void executeCommand() {
        command.executeDo();
    }

    public void undoCommand() {
        command.executeUndo();
    }

}
