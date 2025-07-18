package org.aslihankcbs.aop.greeting.aspectJ.impl.farEast;

import org.aslihankcbs.aop.greeting.aspectJ.advice.ex.NotGoodNameException;
import org.aslihankcbs.aop.greeting.aspectJ.contract.Greeter;

public class JapaneseGreeter implements Greeter {
    String selamInJapanese = "\u4eca\u65e5\u306f\u4e16\u754c";

    @Override
    public String greet(String name) throws NotGoodNameException {
        if (!name.equals("Miho"))
            throw new NotGoodNameException("Name is not a good Japanese name!" + name);
        return selamInJapanese + ' ' + name;
    }
}
