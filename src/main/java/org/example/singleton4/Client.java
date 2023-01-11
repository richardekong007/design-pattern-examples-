package org.example.singleton4;


public class Client {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team.");
        Captain captain1 = CaptainSingleton.INSTANCE.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = CaptainSingleton.INSTANCE.getCaptain();
        if (captain1.equals(captain2)){
            System.out.println("Both captain1 and captain2 are the same.");
        }
    }

}
