package org.aslihankcbs.aop.greeting.basic.impl;

import org.aslihankcbs.aop.greeting.basic.contract.Greeter;

public class Hello implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
