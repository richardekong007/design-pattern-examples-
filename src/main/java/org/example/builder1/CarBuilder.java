package org.example.builder1;

public class CarBuilder implements Builder{

    Car car;

    public CarBuilder(){
        car = new Car("Ford");
    }

    @Override
    public void addBrandName() {
        car.add(String.format("Adding the car brand: %s", car.brandName));
    }

    @Override
    public void buildBody() {
        car.add("Making the car body");
    }

    @Override
    public void insertWheels() {
        car.add("4 wheels are added to the car");
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
