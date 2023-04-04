package dev.sim0n.app.test.impl.annotation;

/**
 * @author sim0n
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface TestAnnotation {
    String string();

    int intValue();

    double doubleValue();
}