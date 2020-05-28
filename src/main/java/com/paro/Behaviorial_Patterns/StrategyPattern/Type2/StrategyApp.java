package com.paro.Behaviorial_Patterns.StrategyPattern.Type2;

public class StrategyApp {
    public static void main(String[] args) {
        TextFormatter formatter=new CapTextFormatter();
        TextEditor editor=new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");

        formatter=new LowerTextFormatter();
        editor=new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}
