package io.github.andrioli.euler;

import static io.github.andrioli.euler.utils.Multiples.of;
import io.github.andrioli.euler.utils.Multiples;

import java.util.stream.IntStream;

/**
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * </p>
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * </p>
 */
public class Problem001 implements ProjectEulerProblem {

    private final int upperBoundLimit;

    public Problem001(final int upperBoundLimit) {
        this.upperBoundLimit = upperBoundLimit;
    }

    @Override
    public String solve() {
        final int sum = IntStream.range(1, upperBoundLimit).filter(Multiples.of(3).or(of(5))).sum();
        return Integer.toString(sum);
    }

}
