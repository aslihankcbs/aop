package org.aslihankcbs.aop.greeting.basic.advice;

import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// MethodInterceptor -> aopalliance
public class AroundAdvice implements MethodInterceptor {
    /*
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.err.println("- Before -");
        Method method = invocation.getMethod();
        System.err.println("Method: " + method.getName());
        System.err.println("Target: " + invocation.getThis().getClass().getName());
        System.err.println("There are " + invocation.getArguments().length + " arguments.");
        System.err.println("Proceeding to the method");
        Object returnedValue = invocation.proceed();
        System.err.println("Just returned from the method");
        System.err.println("Returned value: " + returnedValue);
        System.err.println("- After -");
        return returnedValue;
    }*/

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("- Aslihan -");
        Object returnedValue = invocation.proceed(); // proceed i cağırmaya da bilirdi
        System.out.println(" naber ");
        return returnedValue;
    }
}
