package com.programmingsquirrel.coffeeshop.injection.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//The Component annotation marks the Class as a Bean that need to created by Spring
@Component
public class MakeCoffeeAnotherImplementation {

    private Coffee coffee;

    @Autowired
    public void setCoffe(Coffee coffee){
        this.coffee = coffee;
        System.out.println("Make Coffee Setter Implementation invoked");
    }

    public void prepareCoffe(){
        coffee.prepareCoffee();
        System.out.println("The Coffee is ready");
    }


}
