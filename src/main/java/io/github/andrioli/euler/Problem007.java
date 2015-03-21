package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.seq.IntSeq;
import io.github.andrioli.euler.utils.seq.Prime;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Problem007 implements ProjectEulerProblem {

    private final int nth;

    public Problem007(final int nth) {
        this.nth = nth;
    }

    @Override
    public String solve() {
        final IntSeq prime = new Prime();
        for (int i = 1; i < nth; i++) {
            prime.next();
        }
        return Integer.toString(prime.next());
    }

}
