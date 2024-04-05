package com.enigma.java_di.bean;

import com.enigma.java_di.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GasolineEngine extends Engine{
    @Override
    public void sound() {

        System.out.println("Brummm");

    }
}
