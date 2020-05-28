package com.paro.Structural_Patterns.BridgePattern.Type2;

public abstract class Car {
    private final Product product;
    private final String carType;


    protected Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails(){
        System.out.println("Car: "+carType+", Product: "+product.productName());
    }
}
