package org.example.builder3;

public class Mobile extends Device{

    private static final String physicalAddress = "00:00:5e:00:53:af";

    public Mobile(){
        this.macAddress = physicalAddress;
    }

}
