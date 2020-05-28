package com.paro.Creational_Patterns.BuilderPattern.Type3;

public class Motorcycle implements Builder{
    private String brandName;
    private Product product;
    public Motorcycle(String brand) {
        this.brandName=brand;
        product=new Product();
    }


    @Override
    public void startUpOperations() {

    }

    @Override
    public void buildBody() {
        product.add("This is a body of Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 Headlights are added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
