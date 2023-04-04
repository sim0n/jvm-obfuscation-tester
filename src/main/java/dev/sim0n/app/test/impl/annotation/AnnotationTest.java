package dev.sim0n.app.test.impl.annotation;

import dev.sim0n.app.test.Test;

/**
 * @author sim0n
 */
@TestAnnotation(string = "Test", doubleValue = 0.36, intValue = 36)
public class AnnotationTest implements Test {

    @Override
    public void run() {
        Class<? extends AnnotationTest> clazz = AnnotationTest.class;

        if (clazz.isAnnotationPresent(TestAnnotation.class)) {
            TestAnnotation annotation = clazz.getAnnotation(TestAnnotation.class);

            String value = annotation.string();
            double doubleValue = annotation.doubleValue();
            int intValue = annotation.intValue();

            System.out.println("Testing annotations");
            System.out.printf("%s, %s, %d%n", value, doubleValue, intValue);
        } else {
            throw new IllegalStateException("Annotation not present");
        }
    }
}
