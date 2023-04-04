package dev.sim0n.app.test.impl.visitor;

/**
 * @author sim0n
 */
public interface Visitable {

    String hello = "";
    void accept(Visitor visitor);
}
