package org.aslihankcbs.aop.greeting.aspectJ.conf;

import org.aslihankcbs.aop.greeting.aspectJ.advice.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AspectConfig {

    @Bean(name = "aroundAspect")
    public AroundAspect getAroundAspect() {
        AroundAspect logAspect = new AroundAspect();
        return logAspect;
    }

    @Bean(name = "beforeAspect")
    public BeforeAspect getBeforeAspect() {
        BeforeAspect beforeAspect = new BeforeAspect();
        return beforeAspect;
    }

    @Bean(name = "afterAspect")
    public AfterAspect getAfterAspect() {
        AfterAspect afterAspect = new AfterAspect();
        return afterAspect;
    }

    @Bean(name = "afterThrowingAspect")
    public AfterThrowingAspect getAfterThrowingAspect() {
        AfterThrowingAspect afterThrowingAspect = new AfterThrowingAspect();
        return afterThrowingAspect;
    }
}
