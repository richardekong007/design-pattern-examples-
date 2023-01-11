package org.example.singleton2;

public class Captain {
    //Early initialization
    private final static Captain CAPTAIN_INSTANCE = new Captain();
    // Making the constructor private
    // to prevent the use of "new"
    private Captain(){
        System.out.println("\tA new captain is elected for your team.");
    }

    public static Captain getCaptain(){
        System.out.println("\tYou already have a captain for your team.");
        System.out.println("\tSend him for the toss.");
        return CAPTAIN_INSTANCE;
    }

}
