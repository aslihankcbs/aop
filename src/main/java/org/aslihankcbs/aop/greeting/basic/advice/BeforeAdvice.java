package org.aslihankcbs.aop.greeting.basic.advice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(" Aslihan ");
        // target / join point e müdahale edemiyoruz
    }

   /*
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.err.println("- in BeforeAdvice -");
        System.err.println("Method: " + method.getName());
        System.err.println("Target: " + target.getClass().getName());
        System.err.println("There are " + args.length + " arguments.");
        System.err.println("Proceeding to the target");
    }*/
}

