package org.example.builder1;

/**
 * The CarDirector directs the
 * car's instantiation steps.
 */
public class CarDirector extends Director{

    // The car director follows
    // its own sequence:
    // Make body-> add wheels->then add the brand name.
    @Override
    public Vehicle instruct(Builder builder) {

        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}
