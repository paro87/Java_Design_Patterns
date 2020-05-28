package com.paro.Behaviorial_Patterns.StrategyPattern.Type2;

public class LowerTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: "+text.toLowerCase());
    }
}
