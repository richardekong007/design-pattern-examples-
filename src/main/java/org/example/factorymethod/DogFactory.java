package org.example.factorymethod;

public class DogFactory extends AnimalFactory{

    //Creating and returning a 'Dog' instance

    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
