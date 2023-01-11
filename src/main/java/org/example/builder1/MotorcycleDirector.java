package org.example.builder1;

public class MotorcycleDirector extends Director{

    // The motorcycle director follows
    // its own sequence:
    // Add brand name-> make body-> insert wheels.
    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}
