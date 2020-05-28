package com.paro.Creational_Patterns.BuilderPattern.Type1;

interface CarBuilder {
    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
    Car getCar();
}
