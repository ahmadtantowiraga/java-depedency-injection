package com.enigma.java_di.bean;

import com.enigma.java_di.bean.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    public String name;
    private  Engine engine;
//    @Autowired
//    public Car(@Value("") String name, @Qualifier("gasolineEngine") Engine engine) {
//        this.name = name;
//        this.engine = engine;
//    }

    @Autowired
    public Car(@Qualifier("gasolineEngine") Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
