package org.aslihankcbs.aop.greeting.aspectJ.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
public class BeforeAspect {

    //@Before("execution(* *.greet(..))")
    public void callBefore(JoinPoint joinPoint) {
        try {
            System.out.println("BeforeAspect: The method " + joinPoint.getSignature().getName() + "() with argument " + Arrays.toString(joinPoint.getArgs()));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
            throw e;
        }
        System.out.println();
    }
}
