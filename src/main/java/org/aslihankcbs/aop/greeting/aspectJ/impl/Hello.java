package org.aslihankcbs.aop.greeting.aspectJ.impl;

import org.aslihankcbs.aop.greeting.aspectJ.contract.Greeter;

public class Hello implements Greeter {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}
