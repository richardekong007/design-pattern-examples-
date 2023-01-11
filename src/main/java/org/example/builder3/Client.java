package org.example.builder3;


public class Client {

    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demo2(Using method chaining) ***");
// Making a mobile device
        Builder builder = new MobileBuilder();
// Construction Steps:
// set name-> set color-> set type -> set screen size -> set ram -> set IP Address.
        Device device = builder
                .setName("Samsung")
                .setColor("Black")
                .setType("Mobile")
                .setScreenSize(385 * 854)
                .setRam(8)
                .setIPAddress("192.168.10.2")
                .build();
        device.showDetails();
// Making a desktop device
        builder = new DesktopBuilder();
// set name-> set color-> set type -> set screen size -> set ram -> set IP Address.
        device = builder
                .setName("Dell")
                .setColor("Black")
                .setType("Desktop")
                .setScreenSize(1280 * 1024)
                .setRam(16)
                .setIPAddress("192.168.10.3")
                .build();
        device.showDetails();
    }

}
