package com.paro.Structural_Patterns.DecoratorPattern.Type2.Decorators;

import com.paro.Structural_Patterns.DecoratorPattern.Type2.Pizza;
import com.paro.Structural_Patterns.DecoratorPattern.Type2.PizzaDecorator;

public class Meat extends PizzaDecorator {
    private final Pizza pizza;
    public Meat(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Meat (14.25)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+14.25;
    }
}
