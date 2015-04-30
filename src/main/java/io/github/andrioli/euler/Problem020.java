package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.Math;

/**
 * <p>
 * <i>n</i>! means <i>n</i> × (<i>n</i> − 1) × ... × 3 × 2 × 1
 * </p>
 * <p>
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * </p>
 * <p>
 * Find the sum of the digits in the number 100!
 * </p>
 */
public class Problem020 implements ProjectEulerProblem {

    private final int value;

    public Problem020(final int value) {
        this.value = value;
    }

    @Override
    public String solve() {
        final String fact = Math.factorial(value).toString();
        final int sum = fact.chars().map(ch -> ch - '0').sum();
        return Integer.toString(sum);
    }

}
