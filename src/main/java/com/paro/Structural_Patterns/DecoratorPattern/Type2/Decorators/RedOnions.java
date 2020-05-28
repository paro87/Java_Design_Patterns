package com.paro.Structural_Patterns.DecoratorPattern.Type2.Decorators;

import com.paro.Structural_Patterns.DecoratorPattern.Type2.Pizza;
import com.paro.Structural_Patterns.DecoratorPattern.Type2.PizzaDecorator;

public class RedOnions extends PizzaDecorator {
    private final Pizza pizza;
    public RedOnions(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Red Onions (3.75)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+3.75;
    }
}
