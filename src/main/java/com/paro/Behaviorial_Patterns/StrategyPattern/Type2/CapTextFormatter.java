package com.paro.Behaviorial_Patterns.StrategyPattern.Type2;

public class CapTextFormatter implements TextFormatter{

    @Override
    public void format(String text) {
        System.out.println("CapTextFormatter: "+text.toUpperCase());
    }
}
