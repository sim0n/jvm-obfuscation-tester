package dev.sim0n.app.test.impl.evaluation.operation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author sim0n
 */
@Getter
@RequiredArgsConstructor
public enum IntMathOperation {
    ADD("+") {
        @Override
        public int evaluate(int first, int second) {
            return first + second;
        }
    },
    SUB("-") {
        @Override
        public int evaluate(int first, int second) {
            return first - second;
        }
    },
    DIV("/") {
        @Override
        public int evaluate(int first, int second) {
            return first / second;
        }
    },
    REM("%") {
        @Override
        public int evaluate(int first, int second) {
            return first % second;
        }
    },
    MUL("*") {
        @Override
        public int evaluate(int first, int second) {
            return first * second;
        }
    },
    XOR("^") {
        @Override
        public int evaluate(int first, int second) {
            return first ^ second;
        }
    };

    private final String desc;

    public abstract int evaluate(int first, int second);
}
