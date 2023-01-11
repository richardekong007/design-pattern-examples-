package org.example.builder2;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demo2(Using method chaining) ***");
// Making a car
        Builder builder = new CarBuilder();
// Construction Steps:
// Make body-> add wheels->then add the brand name.
        Vehicle vehicle=builder.buildBody()
                .insertWheels()
                .addBrandName()
                .build();
        vehicle.showProduct();
// Making a motorcycle
        builder = new MotorCycleBuilder();
// Add brand name-> make body-> insert wheels.
        vehicle=builder.addBrandName()
                .buildBody()
                .insertWheels()
                .build();
        vehicle.showProduct();
    }

}
