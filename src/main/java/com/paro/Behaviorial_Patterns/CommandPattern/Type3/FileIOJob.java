package com.paro.Behaviorial_Patterns.CommandPattern.Type3;

import lombok.Setter;

public class FileIOJob implements Job{
    @Setter
    private FileIO fileIO;

    @Override
    public void run() {
        if (fileIO!=null){
            fileIO.execute();
        } try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
