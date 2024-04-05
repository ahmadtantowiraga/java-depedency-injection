package com.enigma.java_di.bean;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine extends Engine{
    @Override
   public void sound() {
        System.out.println("mberrr");

    }
}
