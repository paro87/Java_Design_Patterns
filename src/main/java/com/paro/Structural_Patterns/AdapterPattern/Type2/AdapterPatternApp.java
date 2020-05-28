package com.paro.Structural_Patterns.AdapterPattern.Type2;

public class AdapterPatternApp {
    public static void main(String[] args) {
        CalculatorAdapter calculatorAdapter=new CalculatorAdapter();
        Triangle triangle=new Triangle(20,10);
        System.out.println(calculatorAdapter.getArea(triangle));
    }
}
