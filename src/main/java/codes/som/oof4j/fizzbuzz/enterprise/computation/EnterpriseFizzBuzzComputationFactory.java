package codes.som.oof4j.fizzbuzz.enterprise.computation;

import codes.som.oof4j.fizzbuzz.enterprise.EnterpriseFizzBuzzExecutionEnvironment;

public class EnterpriseFizzBuzzComputationFactory {
    public static EnterpriseFizzBuzzComputationTask buildComputationTask() {
        return new EnterpriseFizzBuzzComputationTask(EnterpriseFizzBuzzExecutionEnvironment.getInstance().getIterations());
    }
}
