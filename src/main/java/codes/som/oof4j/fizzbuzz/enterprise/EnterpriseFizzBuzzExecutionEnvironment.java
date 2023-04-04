package codes.som.oof4j.fizzbuzz.enterprise;

public class EnterpriseFizzBuzzExecutionEnvironment {
    private static final EnterpriseFizzBuzzExecutionEnvironment INSTANCE = new EnterpriseFizzBuzzExecutionEnvironment();
    public static EnterpriseFizzBuzzExecutionEnvironment getInstance() {
        return INSTANCE;
    }

    private int iterations = 100;

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }
}
