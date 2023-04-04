package dev.sim0n.app.test.impl.fizzbuzz;

import codes.som.oof4j.fizzbuzz.enterprise.EnterpriseFizzBuzzCommandLineResultSubscriber;
import codes.som.oof4j.fizzbuzz.enterprise.EnterpriseFizzBuzzExecutionEnvironment;
import codes.som.oof4j.fizzbuzz.enterprise.computation.EnterpriseFizzBuzzComputationFactory;
import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResultPublisher;
import dev.sim0n.app.test.Test;

/**
 * @see https://github.com/char/oof-jvm/tree/master/src/fizzbuzz_enterprise
 * @author char
 */
public class FizzBuzzTest implements Test {
    @Override
    public void run() {
        EnterpriseFizzBuzzExecutionEnvironment.getInstance().setIterations(2);

        Runnable task = EnterpriseFizzBuzzComputationFactory.buildComputationTask();
        ((FizzBuzzResultPublisher) task).registerSubscriber(new EnterpriseFizzBuzzCommandLineResultSubscriber(System.out));

        task.run();
    }
}
