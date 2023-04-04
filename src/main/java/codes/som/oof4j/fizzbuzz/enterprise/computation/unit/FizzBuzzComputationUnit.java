package codes.som.oof4j.fizzbuzz.enterprise.computation.unit;

import codes.som.oof4j.fizzbuzz.enterprise.results.FizzBuzzResult;
import codes.som.oof4j.fizzbuzz.enterprise.results.internal.*;

public class FizzBuzzComputationUnit {
    private final int iteration;

    public FizzBuzzComputationUnit(int iteration) {
        this.iteration = iteration;
    }

    public final FizzBuzzResult calculate() {
        Flags flags = new Flags();
        FizzBuzzRuleApplicator.applyAllRules(iteration, flags);

        String message = FizzBuzzComputationUnitLookupTableEntry.values()[flags.getValue()].toString();
        if (message == null) {
            message = String.valueOf(iteration);
        }

        return new FizzBuzzResultImpl(iteration, message);
    }
}
