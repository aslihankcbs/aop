package org.aslihankcbs.aop.greeting.basic.advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnedValue, Method method, Object[] args, Object target) throws Throwable {
        System.err.println("\n- in AfterAdvice -");
        System.err.println("Method: " + method.getName());
        System.err.println("Target: " + target.getClass().getName());
        System.err.println("There are " + args.length + " arguments.");
        System.err.println("Returned Value: " + returnedValue);
        System.err.println("- in AfterAdvice -");
    }
}
