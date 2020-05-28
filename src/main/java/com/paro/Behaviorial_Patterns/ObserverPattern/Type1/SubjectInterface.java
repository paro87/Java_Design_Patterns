package com.paro.Behaviorial_Patterns.ObserverPattern.Type1;

public interface SubjectInterface {
    void register(ObserverInterface observer);
    void unregister(ObserverInterface observer);
    void notifyRegisteredUsers(int notifiedValue);
}
