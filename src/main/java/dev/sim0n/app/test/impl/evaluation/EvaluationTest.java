package dev.sim0n.app.test.impl.evaluation;

import dev.sim0n.app.test.Test;
import dev.sim0n.app.test.impl.evaluation.operation.IntMathOperation;

import java.security.SecureRandom;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sim0n
 */
public class EvaluationTest implements Test {
    private static final SecureRandom RANDOM = new SecureRandom();

    @Override
    public void run() {
        System.out.println("Running evaluation test");
        Supplier<Integer> randomInt = () -> 1 + RANDOM.nextInt(20);
        Supplier<Integer> randomIntMathOp = () -> RANDOM.nextInt(IntMathOperation.values().length);

        List<Evaluation<Integer>> evaluations = Stream.generate(() -> new Evaluation<>(randomInt.get(), randomInt.get(), n -> {
            IntMathOperation op = IntMathOperation.values()[RANDOM.nextInt(IntMathOperation.values().length)];

            int first = randomInt.get();
            int second = randomInt.get();

            System.out.println(first + " " + op.getDesc() + " " + second + " = " + op.evaluate(first, second));
        })).limit(5).collect(Collectors.toList());

        evaluations.forEach(e -> e.getEvaluator().accept(randomIntMathOp.get()));

        System.out.println("Finished evaluation test");
    }

}
