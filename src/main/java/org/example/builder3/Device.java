package org.example.builder3;

public class Device {
    protected String name, color, type, macAddress, IPAddress;
    protected int screenSize, ram, storage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return String.format("{\n\"name\":\"%s\",\n\"color\":\"%s\",\n\"type\":\"%s\",\n\"macAddress\":\"%s\",\n\"IPAddress\":\"%s\",\n\"screenSize\":%d,\n\"ram\":%d,\n\"storage\":%d\n}",
                name, color,type,macAddress,IPAddress,screenSize,ram, storage);
    }

    public void showDetails() {
        System.out.println(this.toString());
    }
}
