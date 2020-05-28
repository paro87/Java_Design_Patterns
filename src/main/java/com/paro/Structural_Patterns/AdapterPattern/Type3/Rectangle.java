package com.paro.Structural_Patterns.AdapterPattern.Type3;

public class Rectangle implements RectangleInterface{
    public double length;
    public double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public double calculateAreaOfRectangle() {
        return length*width;
    }
}
