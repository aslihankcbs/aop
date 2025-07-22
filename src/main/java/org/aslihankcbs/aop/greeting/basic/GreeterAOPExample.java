package org.aslihankcbs.aop.greeting.basic;

import org.aslihankcbs.aop.greeting.basic.advice.*;
import org.aslihankcbs.aop.greeting.basic.contract.Greeter;
import org.aslihankcbs.aop.greeting.basic.impl.*;
import org.springframework.aop.framework.ProxyFactory;

public class GreeterAOPExample {

    public static void main(String[] args) {
        // target objesi AOP yı uygulayacağımız obje!
       Greeter target = new Selam();
		//Greeter target = new Hello();

		//runTarget(target);
        //runBeforeAdvice(target);
		//runAfterAdvice(target);
//		runAroundAdvice(target);
    }

    public static void runTarget(Greeter target) {
        target.greet();
    }

    // AOP Proxy'lerle çalışıyor! Proxy design pattern i dusunebiliriz
    public static void runBeforeAdvice(Greeter target) {
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new BeforeAdvice()); // weaving yapıyoruz linked yapıyoruz.
        factory.setTarget(target); // target objen bu!
        Greeter proxy = (Greeter) factory.getProxy(); // bana proxy i ver
        proxy.greet(); // burada sonuç olarak Aslihan Selam çalıştı.   önce Advice calıstı -> Aslihan sonra target(Selam) in yapacağı iş calıstı.Yani join point.
    }

    // return value yu alabilirsin.
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
