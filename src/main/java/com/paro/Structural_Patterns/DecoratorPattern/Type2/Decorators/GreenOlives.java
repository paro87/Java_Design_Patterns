package com.paro.Structural_Patterns.DecoratorPattern.Type2.Decorators;

import com.paro.Structural_Patterns.DecoratorPattern.Type2.Pizza;
import com.paro.Structural_Patterns.DecoratorPattern.Type2.PizzaDecorator;

public class GreenOlives extends PizzaDecorator {
    private final Pizza pizza;
    public GreenOlives(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Green Olives (5.47)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+5.47;
    }
}
