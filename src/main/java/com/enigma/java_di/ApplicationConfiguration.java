package com.enigma.java_di;

import com.enigma.java_di.bean.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.enigma.java_di")
public class ApplicationConfiguration {
    @Bean
    public GasolineEngine gasolineEngine(){
        return new GasolineEngine();
    }
//    @Bean(name ="mesinDiesel")
//    public DieselEngine dieselEngine(){
//        return new DieselEngine();
//    }
//    @Bean
//    @Scope("prototype")
//    public ElectricEngine electricEngine(){
//        return new ElectricEngine();
//    }
//    @Bean(name = "civic")
//    public Car civic(@Qualifier("gasolineEngine") Engine engine){
//        return new Car("civic", engine);
//    }

    void swho(){
        System.out.println("ada");
    }
//
//    @Bean(name="avanza")
//    public  Car avanza(@Qualifier("electricEngine") Engine engine){
//        return new Car("avanza", engine);
//    }


}
