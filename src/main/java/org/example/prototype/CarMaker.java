package org.example.prototype;

public class CarMaker {
    BasicCar nano, ford;

    public CarMaker() {

    }

    public BasicCar getNano() throws
            CloneNotSupportedException {
        if (nano != null) {
            return nano.clone();
        } else {
            nano = new Nano("Nano XM624 cc");
            return nano;
        }
    }

    public BasicCar getFord() throws
            CloneNotSupportedException {
        if (ford != null) {
            return ford.clone();
        } else {
            ford = new Ford("Ford Aspire");
            return ford;
        }
    }
}
