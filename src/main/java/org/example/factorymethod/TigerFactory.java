package org.example.factorymethod;

public class TigerFactory extends AnimalFactory{

    @Override
    protected Animal createAnimal() {
        return new Tiger();
    }
}
