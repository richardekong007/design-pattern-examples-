package org.example.singleton3;

public class Captain {

    // Making the constructor private
    // to prevent the use of "new"
    private Captain() {
        System.out.println("\tA new captain is elected for your team.");
    }

    //The helper class
    private static class SingletonHelper {
        //Early initialization
        private final static Captain CAPTAIN_INSTANCE = new Captain();
    }

    public static Captain getCaptain() {
        // This nested class is referenced after
        // the getCaptain() method is called.
        return SingletonHelper.CAPTAIN_INSTANCE;
    }

}
