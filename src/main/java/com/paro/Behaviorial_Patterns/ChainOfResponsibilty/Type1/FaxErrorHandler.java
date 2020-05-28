package com.paro.Behaviorial_Patterns.ChainOfResponsibilty.Type1;

public class FaxErrorHandler implements Receiver{
    private Receiver nextReceiver;

    @Override
    public boolean handleMessage(Message message) {
        if(message.text.contains("Fax")){
            return true;
        } else {
            if(nextReceiver!=null){
                nextReceiver.handleMessage(message);
            }
        }
        return false;
    }

    @Override
    public void nextErrorHandler(Receiver nextReceiver) {
        this.nextReceiver=nextReceiver;
    }
}
