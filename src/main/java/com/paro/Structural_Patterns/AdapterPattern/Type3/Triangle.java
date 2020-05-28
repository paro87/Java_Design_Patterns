package com.paro.Structural_Patterns.AdapterPattern.Type3;

public class Triangle implements TriangleInterface{
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Triangle");
    }

    @Override
    public double calculateAreaOfTriangle() {
        return 0.5*base*height;
    }
}
