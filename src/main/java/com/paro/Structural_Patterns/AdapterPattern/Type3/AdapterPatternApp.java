package com.paro.Structural_Patterns.AdapterPattern.Type3;

public class AdapterPatternApp {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(20,10);
        System.out.println(rectangle.calculateAreaOfRectangle());

        Triangle triangle=new Triangle(10, 5);
        System.out.println(triangle.calculateAreaOfTriangle());

        RectangleInterface rectangleInterface=new TriangleAdapter(triangle);
        System.out.println(getArea(rectangleInterface));
    }

    static double getArea(RectangleInterface rectangleInterface){
        return rectangleInterface.calculateAreaOfRectangle();
    }
}
