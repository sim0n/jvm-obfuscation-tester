package dev.sim0n.app.test.factory;

import dev.sim0n.app.test.TestRepository;

import java.util.function.Function;

/**
 * @author sim0n
 */
public class PartitioningTestRepositoryFactory implements TestRepositoryFactory {
    private final Function<Runnable, TestRepository> func;

    public PartitioningTestRepositoryFactory(Function<Runnable, TestRepository> func) {
        this.func = func;
    }

    @Override
    public TestRepository build() {
        return this.func.apply(() -> System.out.println("Building test repository"));
    }

}
