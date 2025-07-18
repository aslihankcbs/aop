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
        Greeter greeter = new Hello();
        return greeter;
    }

    @Bean(name = "selamGreeter")
    public Greeter getSelamGreeter() {
        Greeter greeter = new Selam();
        return greeter;
    }

    @Bean(name = "arabicGreeter")
    public Greeter getArabicGreeter() {
        Greeter greeter = new ArabicGreeter();
        return greeter;
    }

    @Bean(name = "japaneseGreeter")
    public Greeter getJapaneseGreeter() {
        Greeter greeter = new JapaneseGreeter();
        return greeter;
    }
}
