package org.example.builder1;

public class Car extends Vehicle{

    String brandName;

    public Car(String brandName){
        this.brandName = brandName;
        System.out.println(String.format(
                "\nWe are about to make a %s car.",
                brandName));
    }

}
