package org.aslihankcbs.aop.greeting.basic.impl;

import org.aslihankcbs.aop.greeting.basic.contract.Greeter;

public class Selam implements Greeter {
    @Override
    // greet -> join point
    public void greet() {
        //business
        System.out.print("Selam");
    }
}