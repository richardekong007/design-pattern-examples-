package org.example.builder2;

import java.util.LinkedList;

public class Vehicle {
    /*
     * You can use any data structure that you prefer.
     * I have used LinkedList<String> in this case.
     */

    private LinkedList<String> parts;

    public Vehicle(){
        parts = new LinkedList<>();
    }

    public void add(String part){
        //Adding part
        parts.add(part);
    }

    public void showProduct(){
        System.out.println("These are the construction sequences:");
        parts.forEach(System.out::println);
    }

}
