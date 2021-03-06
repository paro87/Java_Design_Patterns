package com.paro.Structural_Patterns.DecoratorPattern.Type2.Decorators;

import com.paro.Structural_Patterns.DecoratorPattern.Type2.Pizza;
import com.paro.Structural_Patterns.DecoratorPattern.Type2.PizzaDecorator;

public class Cheese extends PizzaDecorator {
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+", Cheese (20.72)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+20.72;
    }
}
