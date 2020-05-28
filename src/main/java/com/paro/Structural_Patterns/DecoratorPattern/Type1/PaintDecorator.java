package com.paro.Structural_Patterns.DecoratorPattern.Type1;

public class PaintDecorator extends AbstractDecorator{
    public void makeHouse() {
        super.makeHouse();
        paintHouse();
    }

    private void paintHouse() {
        System.out.println("Now I am painting the house");
    }
}
