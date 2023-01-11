package org.example.factorymethod;

public class Dog implements Animal{

    public Dog(){
        System.out.println("\nA Dog is Created");
    }

    @Override
    public void interact() {
        System.out.println("Bark!");
    }
}
