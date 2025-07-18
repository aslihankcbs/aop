package org.aslihankcbs.aop.greeting.aspectJ.impl.arabic;

import org.aslihankcbs.aop.greeting.aspectJ.contract.Greeter;

public class ArabicGreeter implements Greeter {
    private String selamInArabic = "\u0633\u0644\u0627\u0645";

    @Override
    public String greet(String name) {
        return selamInArabic + ' ' + name;
    }
}
