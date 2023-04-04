package dev.sim0n.app.test;

import dev.sim0n.app.test.impl.annotation.AnnotationTest;
import dev.sim0n.app.test.impl.crypttest.BlowfishTest;
import dev.sim0n.app.test.impl.enumtest.EnumConstantsTest;
import dev.sim0n.app.test.impl.evaluation.EvaluationTest;
import dev.sim0n.app.test.impl.fizzbuzz.FizzBuzzTest;
import dev.sim0n.app.test.impl.flow.OpaqueConditionTest;
import dev.sim0n.app.test.impl.flow.WeirdLoopTest;
import dev.sim0n.app.test.impl.inheritance.InheritanceTest;
import dev.sim0n.app.test.impl.interfaceoverlap.InterfaceOverlapTest;
import dev.sim0n.app.test.impl.numbers.NumberComparisonTest;
import dev.sim0n.app.test.impl.trycatch.TryCatchTest;
import dev.sim0n.app.test.impl.visitor.Visitor;
import dev.sim0n.app.test.impl.visitor.VisitorTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author sim0n
 */
public class TestRepository {
    private final Runnable runnable;

    private final List<Test> tests = Arrays.asList(
            new AnnotationTest(),
            new OpaqueConditionTest(),
            new WeirdLoopTest(),

            new InheritanceTest(),

            new EnumConstantsTest(),

            new NumberComparisonTest(),
            new BlowfishTest(),
            new EvaluationTest(),
            new VisitorTest(),
            new FizzBuzzTest(),
            new InterfaceOverlapTest(),
            new TryCatchTest()
    );

    public TestRepository(Runnable runnable) {
        this.runnable = runnable;
    }

    public void run() {
        runnable.run();

        System.out.println("Running tests");
        this.tests.forEach(Test::run);
    }
}
