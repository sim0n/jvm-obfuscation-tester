package dev.sim0n.app.test.impl.inheritance;

import dev.sim0n.app.test.Test;

/**
 * @author char
 */
public class InheritanceTest implements Test {
    @Override
    public void run() {
        ClassA classA = new ClassB();

        classA.methodA();
    }
}
