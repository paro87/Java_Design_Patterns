package com.paro.Behaviorial_Patterns.CommandPattern.Type1;

public class Receiver {
    public void performUndo() {
        System.out.println("Undo");
    }

    public void performRedo() {
        System.out.println("Redo");
    }

    public void doOptionalTaskPriorToUndo() {
        System.out.println("Optional Task prior to undo");
    }

    public void doOptionalTaskPriorToRedo() {
        System.out.println("Optional Task prior to redo");
    }
}
