package org.example.singleton4;

public enum CaptainSingleton {
    INSTANCE;

    private Captain captain = Captain.getCaptain(CaptainSingleton.class);

    public synchronized Captain getCaptain(){
        return captain;
    }
}


