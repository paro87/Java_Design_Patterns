package com.paro.Structural_Patterns.DecoratorPattern.Type2.Decorators;

import com.paro.Structural_Patterns.DecoratorPattern.Type2.Pizza;
import com.paro.Structural_Patterns.DecoratorPattern.Type2.PizzaDecorator;

public class Spinach extends PizzaDecorator {
    private final Pizza pizza;
    public Spinach(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Spinach (7.92)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+7.92;
    }
}
