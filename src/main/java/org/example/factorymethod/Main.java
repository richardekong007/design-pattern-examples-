package org.example.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Factory Method Pattern Demo.***");
        AnimalFactory factory;
        Animal animal;
// Create a tiger and display its behavior
// using TigerFactory.
        factory = new TigerFactory();
        animal = factory.createAnimal();
        animal.interact();
// Create a dog and display its behavior
// using DogFactory.
        factory =new DogFactory();
        animal = factory.createAnimal();
        animal.interact();
    }
}