package org.example.builder3;

public interface Builder {

    Builder setName(String name);
    Builder setColor(String color);
    Builder setType(String type);
    Builder setScreenSize(int size);
    Builder setRam(int ram);
    Builder setStorage(int size);
    Builder setIPAddress(String ip);
    Device build();
}
