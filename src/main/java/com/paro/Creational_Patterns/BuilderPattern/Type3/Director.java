package com.paro.Creational_Patterns.BuilderPattern.Type3;

public class Director {
    Builder builder;
    public void construct(Builder builder){
        this.builder=builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
