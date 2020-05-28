package com.paro.Creational_Patterns.BuilderPattern.Type2;

public class BuilderPatternApp {
    public static void main(String[] args) {
        Form form = new FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123").passwordHint("MyName").city("NY").language("English").build();
        System.out.println(form);
    }
}
