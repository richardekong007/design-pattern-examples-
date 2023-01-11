package org.example.prototype;

import java.util.Random;

public class Nano extends BasicCar{

    public Nano(String modelName){
        this.modelName = modelName;
        basePrice = 5000;
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }

    @Override
    public String toString() {
        return String.format("Model:%s\nPrice:%d\n", modelName, onRoadPrice);
    }
}
