package com.enigma.java_di.bean;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine extends Engine{
    @Override
    public void sound() {
        System.out.println("sssstttt");

    }
}
