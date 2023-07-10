package com.programmingsquirrel.coffeeshop.qualifier.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Mocha")
public class MochaCoffee implements Coffee {

    @Override
    public void prepareCoffee() {
        System.out.println("Making a Mocha...");
    }
}
