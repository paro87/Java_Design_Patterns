package com.paro.Behaviorial_Patterns.MementoPattern.Type2;

import java.util.ArrayList;
import java.util.List;

//Caretaker = client
//Multiple Restore Points
public class MementoApp {
    public static void main(String[] args) {
        List<Memento> savedStates=new ArrayList<>();
        Originator originatorObject=new Originator();
        Memento mementoObject;
        originatorObject.setStateId(1);

        mementoObject=originatorObject.saveMemento(originatorObject.getStateId());
        savedStates.add(mementoObject);

        originatorObject.setStateId(2);
        mementoObject=originatorObject.saveMemento(originatorObject.getStateId());
        savedStates.add(mementoObject);

        originatorObject.setStateId(3);
        mementoObject=originatorObject.saveMemento(originatorObject.getStateId());
        savedStates.add(mementoObject);

        //Reverting back to previous
        originatorObject.revertMemento(mementoObject);

        //Reverting back to specific id
        originatorObject.revertMemento(savedStates.get(0));

        //Reverting back everything
        for (int i = savedStates.size(); i >0 ; i--) {
            originatorObject.revertMemento(savedStates.get(i-1));
        }

    }
}
