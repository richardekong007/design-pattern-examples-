package org.example.prototype;

public abstract class BasicCar implements Cloneable {

    public String modelName;
    public int basePrice = 0, onRoadPrice = 0;
    public String getModelName(){
        return modelName;
    }
    public void setModelName(String name){
        modelName = name;
    }
    protected BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar)super.clone();
    }
}
