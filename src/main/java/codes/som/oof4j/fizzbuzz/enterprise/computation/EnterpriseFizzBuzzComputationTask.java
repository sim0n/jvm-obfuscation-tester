package codes.som.oof4j.fizzbuzz.enterprise.computation;

import codes.som.oof4j.fizzbuzz.enterprise.computation.unit.*;
import codes.som.oof4j.fizzbuzz.enterprise.results.internal.*;

public class EnterpriseFizzBuzzComputationTask extends AbstractFizzBuzzResultPublisherImpl implements Runnable {
    private final int iterations;

    public EnterpriseFizzBuzzComputationTask(int iterations) {
        this.iterations = iterations;
    }

    @Override
    public void run() {
        this.execute();
    }

    private final void execute() {
        for (int iteration = 1; iteration <= iterations; iteration++) {
            FizzBuzzComputationUnit unit = new FizzBuzzComputationUnit(iteration);
            publishResult(unit.calculate());
        }
    }
}
