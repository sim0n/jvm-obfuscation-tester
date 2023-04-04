package dev.sim0n.app.test.impl.inheritance;

/**
 * @author char
 */
public class ClassB implements ClassA {

    @Override
    public void methodA() {
        this.methodB();
    }

    public void methodB() {
        System.out.println("Hello World from Method B");
    }
}
