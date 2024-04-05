package com.enigma.java_di;

import com.enigma.java_di.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class Main {


    public static void main(String[] args) {

//        Car car=new Car("Brio", new GasolineEngine());
//        car.getEngine().sound();
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        GasolineEngine gasolineEngine=(GasolineEngine) context.getBean("gasolineEngine");
//        gasolineEngine.sound();
//        DieselEngine dieselEngine=(DieselEngine) context.getBean("mesinDiesel");
//        dieselEngine.sound();
//
//        ElectricEngine electricEngine=(ElectricEngine) context.getBean("electricEngine");
//        ElectricEngine electricEngine2=(ElectricEngine) context.getBean("electricEngine");
//        electricEngine.sound();


//        System.out.println(electricEngine);
//        System.out.println(electricEngine2);
//        Car avanza=(Car) context.getBean("avanza");
//        Car civic=(Car) context.getBean("civic");
//        System.out.println(civic.name);
//        civic.getEngine().sound();
//        avanza.getEngine().sound();
//        System.out.println(avanza.name);
        ApplicationConfiguration applicationConfiguration=(ApplicationConfiguration) context.getBean("applicationConfiguration");
        applicationConfiguration.swho();

        Car car=(Car) context.getBean("car");
        car.getEngine().sound();

        Main main=new Main();





    }
}