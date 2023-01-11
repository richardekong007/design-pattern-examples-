package org.example.builder1;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demonstration. ***");
        // Making a car
        Builder builder = new CarBuilder();
        Director director = new CarDirector();
        Vehicle vehicle=director.instruct(builder);
        vehicle.showProduct();
        // Making a motorcycle
        builder = new MotorCycleBuilder();
        director = new MotorcycleDirector();
        vehicle=director.instruct(builder);
        vehicle.showProduct();
    }

}
