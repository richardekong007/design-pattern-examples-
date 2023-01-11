package org.example.builder3;

public class Desktop extends Device {

    private static final String physicalAddress = "ac:db:5e:00:53:af";

    public Desktop(){
        this.macAddress = physicalAddress;
    }

}
