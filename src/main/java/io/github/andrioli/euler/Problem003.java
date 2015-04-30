package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.seq.IntSeq;
import io.github.andrioli.euler.utils.seq.Prime;

/**
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * </p>
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 * </p>
 */
public class Problem003 implements ProjectEulerProblem {

    private final long value;

    public Problem003(final long value) {
        this.value = value;
    }

    @Override
    public String solve() {
        final IntSeq prime = new Prime();

        long remainder = value;
        long product = 1;
        int largest = 1;

        while (product != value) {
            final int p = prime.next();
            while (remainder % p == 0) {
                product = product * p;
                remainder = remainder / p;
                largest = p;
            }
        }

        return Integer.toString(largest);
    }

}
