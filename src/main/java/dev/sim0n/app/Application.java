package dev.sim0n.app;

import dev.sim0n.app.test.TestRepository;
import dev.sim0n.app.test.factory.SimpleTestRepositoryFactory;

/**
 * @author sim0n
 */
public class Application {
    private final TestRepository testRepository = SimpleTestRepositoryFactory.INSTANCE.build();
    public void run() {
        System.out.println("Starting application...");

        if (fibRecursion(9) == 34) {
            this.testRepository.run();
        } else {
            throw new IllegalStateException("Fibonacci sequence is incorrect!");
        }

        System.out.println("Successfully passed every test!");
    }

    public int fibRecursion(int n) {
        // N <= 1 is always n
        if (n <= 1) {
            return n;
        }

        // 2 is always 1
        if (n == 2) {
            return 1;
        }

        // calling function recursively for nth Fibonacci
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}
