package org.aslihankcbs.aop.greeting.aspectJ.conf;

import org.aslihankcbs.aop.greeting.aspectJ.contract.Greeter;
import org.aslihankcbs.aop.greeting.aspectJ.impl.*;
import org.aslihankcbs.aop.greeting.aspectJ.impl.arabic.ArabicGreeter;
import org.aslihankcbs.aop.greeting.aspectJ.impl.farEast.JapaneseGreeter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {
    @Bean(name = "helloGreeter")
    public Greeter getHelloGreeter() {
        return new Hello();
    }

    @Bean(name = "selamGreeter")
    public Greeter getSelamGreeter() {
        return new Selam();
    }

    @Bean(name = "arabicGreeter")
    public Greeter getArabicGreeter() {
        return new ArabicGreeter();
    }

    @Bean(name = "japaneseGreeter")
    public Greeter getJapaneseGreeter() {
        return new JapaneseGreeter();
    }
}
