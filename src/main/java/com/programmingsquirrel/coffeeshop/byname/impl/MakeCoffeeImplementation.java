package com.programmingsquirrel.coffeeshop.byname.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//The Component annotation marks the Class as a Bean that need to created by Spring
@Component
public class MakeCoffeeImplementation {

    //With Autowired annotation, the object is wired, the dependency is injected
    @Autowired
    Coffee latteCoffee;

    public void prepareCoffe(){
        latteCoffee.prepareCoffee();
        System.out.println("The Coffee is ready");
    }
}
