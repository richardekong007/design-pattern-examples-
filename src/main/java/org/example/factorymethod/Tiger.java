package org.example.factorymethod;

public class Tiger implements Animal{

    public Tiger(){
        System.out.println("\n A Tiger is created");
    }

    @Override
    public void interact() {
        System.out.println("Roar");
    }
}
