package org.example.builder3;

public class MobileBuilder implements Builder{

    private Mobile mobile;

    public MobileBuilder(){
        mobile = new Mobile();
    }

    @Override
    public Builder setName(String name) {
        mobile.setName(name);
        return this;
    }

    @Override
    public Builder setColor(String color) {
        mobile.setColor(color);
        return this;
    }

    @Override
    public Builder setType(String type) {
        mobile.setType(type);
        return this;
    }

    @Override
    public Builder setScreenSize(int size) {
        mobile.setScreenSize(size);
        return this;
    }

    @Override
    public Builder setRam(int ram) {
        mobile.setRam(ram);
        return this;
    }

    @Override
    public Builder setStorage(int size) {
        mobile.setStorage(size);
        return this;
    }

    @Override
    public Builder setIPAddress(String ip) {
        mobile.setIPAddress(ip);
        return this;
    }

    @Override
    public Device build() {
        return mobile;
    }
}

