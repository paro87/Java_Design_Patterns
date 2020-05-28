package com.paro.Behaviorial_Patterns.MementoPattern.Type1;

//Caretaker = client
//Single Restore Point
public class MementoApp {
    public static void main(String[] args) {
        Originator originatorObject=new Originator();
        Memento mementoObject;
        originatorObject.setStateId(1);

        mementoObject=originatorObject.saveMemento(originatorObject.getStateId());

        originatorObject.setStateId(2);
        mementoObject=originatorObject.saveMemento(originatorObject.getStateId());

        originatorObject.setStateId(3);

        originatorObject.revertMemento(mementoObject);

    }
}
