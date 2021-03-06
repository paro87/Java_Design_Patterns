package com.paro.Behaviorial_Patterns.ObserverPattern.Type2;

public interface Subject {
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
