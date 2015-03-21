package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.seq.IntSeq;
import io.github.andrioli.euler.utils.seq.Prime;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Problem010 implements ProjectEulerProblem {

    private final int upperBoundLimit;

    public Problem010(final int upperBoundLimit) {
        this.upperBoundLimit = upperBoundLimit;
    }

    @Override
    public String solve() {
        final IntSeq prime = new Prime();

        long sum = 0;
        int p = prime.next();
        while (p < upperBoundLimit) {
            sum = sum + p;
            p = prime.next();
        }

        return Long.toString(sum);
    }

}
