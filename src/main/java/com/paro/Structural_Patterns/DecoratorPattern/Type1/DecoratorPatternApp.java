package com.paro.Structural_Patterns.DecoratorPattern.Type1;

public class DecoratorPatternApp {
    public static void main(String[] args) {
        ConcreteComponent withoutDecorator=new ConcreteComponent();
        withoutDecorator.makeHouse();

        //Using a decorator
        FloorDecorator floorDecorator=new FloorDecorator();
        floorDecorator.setComponent(withoutDecorator);
        floorDecorator.makeHouse();

        PaintDecorator paintDecorator=new PaintDecorator();
        paintDecorator.setComponent(floorDecorator);
        paintDecorator.makeHouse();
    }
}
