package org.aslihankcbs.aop.greeting.aspectJ.conf;

import org.aslihankcbs.aop.greeting.aspectJ.advice.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AspectConfig {

    @Bean(name = "aroundAspect")
    public AroundAspect getAroundAspect() {
        return new AroundAspect();
    }

    @Bean(name = "beforeAspect")
    public BeforeAspect getBeforeAspect() {
        return new BeforeAspect();
    }

    @Bean(name = "afterAspect")
    public AfterAspect getAfterAspect() {
        return new AfterAspect();
    }

    @Bean(name = "afterThrowingAspect")
    public AfterThrowingAspect getAfterThrowingAspect() {
        return new AfterThrowingAspect();
    }
}