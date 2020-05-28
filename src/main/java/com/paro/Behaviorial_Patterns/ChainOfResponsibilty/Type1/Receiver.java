package com.paro.Behaviorial_Patterns.ChainOfResponsibilty.Type1;

public interface Receiver {
    boolean handleMessage(Message message);
    void nextErrorHandler(Receiver nextReceiver);
}
