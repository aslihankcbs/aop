package org.aslihankcbs.aop.greeting.aspectJ.contract;

import org.aslihankcbs.aop.greeting.aspectJ.advice.ex.NotGoodNameException;

public interface Greeter {
    String greet(String name) throws NotGoodNameException;
}
