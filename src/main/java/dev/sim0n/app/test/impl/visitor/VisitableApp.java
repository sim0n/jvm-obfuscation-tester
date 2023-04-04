package dev.sim0n.app.test.impl.visitor;

/**
 * @author sim0n
 */
public class VisitableApp implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(System.out);
    }
}
