package com.paro.Behaviorial_Patterns.CommandPattern.Type3;

import lombok.Setter;

public class SmsJob implements Job{
    @Setter
    private Sms sms;

    @Override
    public void run() {
        if(sms!=null) {
            sms.sendSms();
        } try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
