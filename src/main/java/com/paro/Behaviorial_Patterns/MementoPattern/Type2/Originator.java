package com.paro.Behaviorial_Patterns.MementoPattern.Type2;

import lombok.Getter;
import lombok.Setter;

public class Originator {
    @Getter
    @Setter
    private int stateId;
    public Originator() {
        this.stateId=0;
    }

    public Memento saveMemento(int stateId) {
        System.out.println("Saving originator's current state id");
        return new Memento(stateId);
    }

    public void revertMemento(Memento previousMemeno) {
        System.out.println("Restoring to state id ...");
        this.stateId=previousMemeno.getStateId();
        System.out.println("Current state id: "+stateId);
    }
}
