package dev.sim0n.app.test.impl.visitor;

import java.io.PrintStream;

/**
 * @author sim0n
 */
public class AppVisitor implements Visitor {

    @Override
    public void visit(PrintStream printStream) {
        printStream.println("Hello world from Visitor!");
    }
}
