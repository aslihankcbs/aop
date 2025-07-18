package org.aslihankcbs.aop.greeting.aspectJ;

import org.aslihankcbs.aop.greeting.basic.advice.AfterAdvice;
import org.aslihankcbs.aop.greeting.basic.advice.AroundAdvice;
import org.aslihankcbs.aop.greeting.basic.advice.BeforeAdvice;
import org.aslihankcbs.aop.greeting.basic.contract.Greeter;
import org.aslihankcbs.aop.greeting.basic.impl.Selam;
import org.springframework.aop.framework.ProxyFactory;

public class GreetingAOPExample {

    public static void main(String[] args) {
        Greeter target = new Selam();
//		Greeter target = new Hello();

//		runTarget(target);
        runBeforeAdvice(target);
//		runAfterAdvice(target);
//		runAroundAdvice(target);
    }

    public static void runTarget(Greeter target) {
        target.greet();
    }

    public static void runBeforeAdvice(Greeter target) {
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new BeforeAdvice());
        factory.setTarget(target);
        Greeter proxy = (Greeter) factory.getProxy();
        proxy.greet();
    }

    public static void runAfterAdvice(Greeter target) {
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new AfterAdvice());
        factory.setTarget(target);
        Greeter proxy = (Greeter) factory.getProxy();
        proxy.greet();
    }

    public static void runAroundAdvice(Greeter target) {
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new AroundAdvice());
        factory.setTarget(target);
        Greeter proxy = (Greeter) factory.getProxy();
        proxy.greet();
    }
}
