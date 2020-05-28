package com.paro.Creational_Patterns.BuilderPattern.Type3;

public class Car implements Builder{
    private String brandName;
    private Product product;
    public Car(String brand) {
        this.brandName=brand;
        product=new Product();
    }


    @Override
    public void startUpOperations() {
        product.add(String.format("Car model is :%s", this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of Car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 Headlights are added");
    }

    @Override
    public void endOperations() {

    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
