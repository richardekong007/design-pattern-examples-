package org.example.builder2;

public class MotorCycleBuilder implements Builder{

    MotorCycle motorCycle;

    public MotorCycleBuilder(){
        motorCycle = new MotorCycle("Honda");
    }
    @Override
    public Builder addBrandName() {
        motorCycle.add(String.format("Adding the car brand: %s", motorCycle.brandName));
        return this;
    }

    @Override
    public Builder buildBody() {
        motorCycle.add("Making the motorcycle body");
        return this;
    }

    @Override
    public Builder insertWheels() {
        motorCycle.add("2 wheels are added to the motorcycle");
        return this;
    }

    @Override
    public Vehicle build() {
        return motorCycle;
    }
}
