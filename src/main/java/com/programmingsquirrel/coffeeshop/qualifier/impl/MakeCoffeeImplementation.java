package com.programmingsquirrel.coffeeshop.qualifier.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//The Component annotation marks the Class as a Bean that need to created by Spring
@Component
public class MakeCoffeeImplementation {

    /* With Autowired annotation, the object is wired, and using @qualifier Spring knows that bean named "Latte" must
     * be injected in the dependency */
    @Autowired
    @Qualifier("Latte")
    Coffee coffee;

    public void prepareCoffe(){
        coffee.prepareCoffee();
        System.out.println("The Coffee is ready");
    }
}
