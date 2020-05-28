package com.paro.Creational_Patterns.BuilderPattern.Type3;

public interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadlights();
    void endOperations();

    Product getVehicle();
}
