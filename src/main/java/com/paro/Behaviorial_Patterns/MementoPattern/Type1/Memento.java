package com.paro.Behaviorial_Patterns.MementoPattern.Type1;

import lombok.Getter;

public class Memento {
    @Getter
    private int stateId;
    public Memento(int stateId) {
        this.stateId=stateId;
    }




}
