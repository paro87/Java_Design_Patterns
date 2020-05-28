package com.paro.Structural_Patterns.DecoratorPattern.Type2.Decorators;

import com.paro.Structural_Patterns.DecoratorPattern.Type2.Pizza;
import com.paro.Structural_Patterns.DecoratorPattern.Type2.PizzaDecorator;

public class FetaCheese extends PizzaDecorator {
    private final Pizza pizza;
    public FetaCheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Feta Cheese (25.88)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+25.88;
    }
}
