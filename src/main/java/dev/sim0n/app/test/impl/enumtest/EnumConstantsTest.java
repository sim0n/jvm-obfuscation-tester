package dev.sim0n.app.test.impl.enumtest;

import dev.sim0n.app.test.Test;

/**
 * @see https://github.com/char/oof-jvm/blob/master/src/enum_constants/java/codes/som/oof4j/enumconstants/EnumConstants.java
 * @author char
 */
public class EnumConstantsTest implements Test {
    public void run() {
        for (EnumConstant constant : EnumConstant.class.getEnumConstants()) {
            System.out.println(constant);
        }
    }
}
