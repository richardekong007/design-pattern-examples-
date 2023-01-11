package org.example.prototype;

import java.util.Random;

public class Ford extends BasicCar{

    public Ford(String modelName){
        this.modelName = modelName;
        basePrice = 40000;
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }


    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (Ford)super.clone();
    }

    @Override
    public String toString() {
        return String.format("Model:%s\nPrice:%d\n", modelName, onRoadPrice);
    }
}
