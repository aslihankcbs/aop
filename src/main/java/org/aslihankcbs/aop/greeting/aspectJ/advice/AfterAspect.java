package org.aslihankcbs.aop.greeting.aspectJ.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;


@Aspect
public class AfterAspect {

    // bütün paketlerde greet metotlarına uygulanacak!
   // @After("execution(* *.greet(..))")
    public void callAfter(JoinPoint joinPoint) {
        System.out.println();
        try {
            System.out.println(
                    "AfterAspect: The method " + joinPoint.getSignature().getName() + "() with argument " + Arrays.toString(joinPoint.getArgs()));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
            throw e;
        }
    }
}
