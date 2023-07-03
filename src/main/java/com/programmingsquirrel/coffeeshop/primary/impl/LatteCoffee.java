package com.programmingsquirrel.coffeeshop.primary.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*The Component annotation marks the Class as a Bean that need to created by Spring, this bean will be injected int the
* fields of Coffe type and marked with the @Autowire annotation
 */
@Component
@Primary
public class LatteCoffee implements Coffee {

    @Override
    public void prepareCoffee() {
        System.out.println("Making a Latte...");
    }
}
