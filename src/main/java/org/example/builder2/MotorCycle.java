package org.example.builder2;

public class MotorCycle extends Vehicle{

    String brandName;

    public MotorCycle(String brandName){
        this.brandName = brandName;
        System.out.println(String.format(
                "\nWe are about to make a %s motorcycle.", brandName));
    }
}
