package org.aslihankcbs.aop.greeting.aspectJ.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aslihankcbs.aop.greeting.aspectJ.advice.ex.NotGoodNameException;

@Aspect
public class AfterThrowingAspect {

    	@AfterThrowing (pointcut = "execution(* *.greet(..))", throwing="ex")
    public void callAfterThrowingException(NotGoodNameException ex) throws Exception{
        System.out.println("Exception is thrown. It is " + ex);
    }
}
