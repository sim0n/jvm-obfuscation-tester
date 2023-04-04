package dev.sim0n.app.test.impl.evaluation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

/**
 * @author sim0n
 */
@Getter
@RequiredArgsConstructor
public class Evaluation<T extends Number> {
    private final T first, second;

    private final Consumer<T> evaluator;
}
