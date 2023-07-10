package com.programmingsquirrel.coffeeshop.byname.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MochaCoffee implements Coffee {

    @Override
    public void prepareCoffee() {
        System.out.println("Making a Mocha...");
    }
}
