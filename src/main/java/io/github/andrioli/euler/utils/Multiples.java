package io.github.andrioli.euler.utils;

import java.util.function.IntPredicate;

public class Multiples {

    public static IntPredicate of(final int n) {
        return value -> value % n == 0;
    }

}
