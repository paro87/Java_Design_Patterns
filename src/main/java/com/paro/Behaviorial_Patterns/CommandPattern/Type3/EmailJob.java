package com.paro.Behaviorial_Patterns.CommandPattern.Type3;

import lombok.Setter;

public class EmailJob implements Job{
    @Setter
    private Email email;

    @Override
    public void run() {
        if(email!=null) {
            email.sendEmail();
        } try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
