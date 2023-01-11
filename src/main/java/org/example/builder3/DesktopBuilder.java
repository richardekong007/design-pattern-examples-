package org.example.builder3;

public class DesktopBuilder implements Builder{

    private Desktop desktop;

    public DesktopBuilder(){
        desktop = new Desktop();
    }

    @Override
    public Builder setName(String name) {
        desktop.setName(name);
        return this;
    }

    @Override
    public Builder setColor(String color) {
        desktop.setColor(color);
        return this;
    }

    @Override
    public Builder setType(String type) {
        desktop.setType(type);
        return this;
    }

    @Override
    public Builder setScreenSize(int size) {
        desktop.setScreenSize(size);
        return this;
    }

    @Override
    public Builder setRam(int ram) {
        desktop.setRam(ram);
        return this;
    }

    @Override
    public Builder setStorage(int size) {
        desktop.setStorage(size);
        return this;
    }

    @Override
    public Builder setIPAddress(String ip) {
        desktop.setIPAddress(ip);
        return this;
    }

    @Override
    public Device build() {
        return desktop;
    }
}
