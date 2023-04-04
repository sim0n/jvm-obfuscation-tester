package codes.som.oof4j.fizzbuzz.enterprise.computation.unit;

public enum FizzBuzzComputationUnitLookupTableEntry {
    N_LITERAL(null),
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("Fizz Buzz");

    private final String name;
    FizzBuzzComputationUnitLookupTableEntry(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
