package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.seq.Fibonacci;
import io.github.andrioli.euler.utils.seq.IntSeq;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 */
public class Problem002 implements ProjectEulerProblem {

    private final int upperBoundLimit;

    public Problem002(final int upperBoundLimit) {
        this.upperBoundLimit = upperBoundLimit;
    }

    @Override
    public String solve() {
        final IntSeq fibonacci = new Fibonacci();

        int sum = 0;
        int value = fibonacci.next();
        while (value <= upperBoundLimit) {
            if (value % 2 == 0) {
                sum += value;
            }
            value = fibonacci.next();
        }

        return Integer.toString(sum);
    }

}