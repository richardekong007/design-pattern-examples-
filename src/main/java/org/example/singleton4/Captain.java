package org.example.singleton4;

public class Captain {

    private Captain(){
        System.out.println("\tYou already have a captain for your team.");
        System.out.println("\tSend him for the toss.");
    }

    static <T extends CaptainSingleton> Captain getCaptain(Class<T> user){
        return new Captain();
    }
}
