package com.paro.Structural_Patterns.DecoratorPattern.Type2;

public abstract class PizzaDecorator implements Pizza{
    @Override
    public String getDesc() {
        return "Toppings";
    }
}
