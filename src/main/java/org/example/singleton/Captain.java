package org.example.singleton;
// Captain.java
// This class is declared as 'final'.
// So, it cannot have a subclass.
final public class Captain {

    private static Captain captain;
    // Making the constructor private
    // to prevent the use of "new"
    private Captain(){

    }

    public static synchronized Captain getCaptain(){
        // Lazy initialization
        if (captain == null){
            captain = new Captain();
            System.out.println("\tA new captain is elected for your team.");
        }else{
            System.out.println("\tYou already have a captain for your team.");
            System.out.println("\tSend him for the toss.");
        }
        return captain;
    }

}
