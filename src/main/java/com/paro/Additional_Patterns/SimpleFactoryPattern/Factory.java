package com.paro.Additional_Patterns.SimpleFactoryPattern;

import java.util.Scanner;

public class Factory {
    public Animal createAnimal() {
        Animal intendedAnimal=null;
        System.out.println("Enter your choice(0 for Dog, 1 for Tiger)");
        @SuppressWarnings("resource")
        Scanner input=new Scanner(System.in);
        int choice=Integer.parseInt(input.nextLine());
        System.out.println("You have entered :"+choice);
        switch (choice) {
            case 0:
                intendedAnimal=new Dog();
                break;
            case 1:
                intendedAnimal=new Tiger();
                break;
            default:
                System.out.println("You must enter either 0 or 1");
        }
        return intendedAnimal;
    }
}
