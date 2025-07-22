package org.aslihankcbs.aop.greeting.aspectJ;

import org.aslihankcbs.aop.greeting.aspectJ.advice.ex.NotGoodNameException;

import org.aslihankcbs.aop.greeting.aspectJ.contract.Greeter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan({ " org.aslihankcbs.aop.greeting.aspectJ.contract", " org.aslihankcbs.aop.greeting.aspectJ.impl",
        " org.aslihankcbs.aop.greeting.aspectJ.conf" })
public class GreetingAOPExample {

    public static void main(String[] args) throws NotGoodNameException {
        ApplicationContext context = new AnnotationConfigApplicationContext(GreetingAOPExample.class);

        Greeter hello = (Greeter) context.getBean("helloGreeter");
        String greeting = hello.greet("John");
        System.out.println(greeting);

        Greeter selam = (Greeter) context.getBean("selamGreeter");
        greeting = selam.greet("Aslihan");
        System.out.println(greeting);

        Greeter arabic = (Greeter) context.getBean("arabicGreeter");
        greeting = arabic.greet("Salah");
        System.out.println(greeting);

        Greeter japanesGereeter = (Greeter) context.getBean("japaneseGreeter");
        greeting = japanesGereeter.greet("Mihox");
        System.out.println(greeting);
    }
}