package org.aslihankcbs.aop.greeting.aspectJ.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Aspect
public class AroundAspect {

    // bütün greet'ler metotlarına uygula.
   // 	@Around("execution(* *.greet(..))")

    //  bütün methodlara uygulanacak. Hata sebebi - AspectConfig getAroundAspect metoduna da aspect uygulamaya calıstıgı icin! Aspect henuz hazır değil
	// @Around("execution(* *.*(..))")

    // butun metotlar ama aspectconfig ve beanconfig tekiler haric
	//@Around("execution(* *.*(..)) && !execution(* org.aslihankcbs.aop.greeting.aspectJ.conf.AspectConfig.*(..)) && !execution(* org.aslihankcbs.aop.greeting.aspectJ.conf.BeanConfig.*(..))")

    //	@Around("execution(* *.*(..)) && !execution(* org.aslihankcbs.aop.greeting.aspectJ.conf.AspectConfig.*(..))")

    //	@Around("execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.Hello.greet(..))")

    //	@Around("execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.Hello.greet(..)) || execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.Selam.greet(..)) || execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.arabic.ArabicGreeter.greet(..))")

    //	@Around("within(org.aslihankcbs.aop.greeting.aspectJ.impl.*)")
//	@Around("within(org.aslihankcbs.aop.greeting.aspectJ.impl.*) || within(org.aslihankcbs.aop.greeting.aspectJ.impl.arabic.*)")
//	@Around("within(org.aslihankcbs.aop.greeting.aspectJ.impl.*) || within(org.aslihankcbs.aop.greeting.aspectJ.impl.arabic.*) || within(org.aslihankcbs.aop.greeting.aspectJ.impl.farEast.*)")
//	@Around("execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.Hello.greet(..)) || execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.Selam.greet(..)) && !execution(* org.aslihankcbs.aop.greeting.aspectJ.impl.arabic.ArabicGreeter.greet(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("\nAroundAspect: The method " + joinPoint.getSignature().getName() + "() with argument " + Arrays.toString(joinPoint.getArgs()));
        try {
            Object result = joinPoint.proceed();
            System.out.println("AroundAspect: The method " + joinPoint.getSignature().getName() + "() ends with [" + result + "]");
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
            throw e;
        }
    }
}
