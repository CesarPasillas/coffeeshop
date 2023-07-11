package com.programmingsquirrel.coffeeshop.injection.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*The Component annotation marks the Class as a Bean that need to created by Spring, this bean will be injected int the
* fields of Coffe type and marked with the @Autowire annotation
 */
@Component
@Qualifier("Latte")
public class LatteCoffee implements Coffee {

    @Override
    public void prepareCoffee() {
        System.out.println("Making a Latte...");
    }
}
