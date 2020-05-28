package com.paro.Behaviorial_Patterns.CommandPattern.Type3;

import lombok.Setter;

public class LoggingJob implements Job{
    @Setter
    private Logging logging;
    @Override
    public void run() {
        if(logging!=null) {
            logging.log();
        } try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
