package com.paro.Behaviorial_Patterns.ObserverPattern.Type1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Subject implements SubjectInterface{
    private int flag;
    List<ObserverInterface> observerList=new ArrayList<>();

    @Override
    public void register(ObserverInterface observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(ObserverInterface observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyRegisteredUsers(int notifiedValue) {
        for (ObserverInterface observer: observerList) {
            observer.update(notifiedValue);
        }
    }
}
