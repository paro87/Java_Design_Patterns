package com.paro.Structural_Patterns.DecoratorPattern.Type1;

public class FloorDecorator extends AbstractDecorator{
    public void makeHouse(){
        super.makeHouse();
        addFloor();
    }

    private void addFloor() {

    }
}
