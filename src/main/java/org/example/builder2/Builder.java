package org.example.builder2;

public interface Builder {

    Builder addBrandName();

    Builder buildBody();

    Builder insertWheels();

    Vehicle build();
}
