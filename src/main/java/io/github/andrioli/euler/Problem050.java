package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.seq.Prime;

/**
 * <p>
 * The prime 41, can be written as the sum of six consecutive primes:
 * </p>
 * <p>
 * 41 = 2 + 3 + 5 + 7 + 11 + 13
 * </p>
 * <p>
 * This is the longest sum of consecutive primes that adds to a prime below
 * one-hundred.
 * </p>
 * <p>
 * The longest sum of consecutive primes below one-thousand that adds to a
 * prime, contains 21 terms, and is equal to 953.
 * </p>
 * <p>
 * Which prime, below one-million, can be written as the sum of the most
 * consecutive primes?
 * </p>
 */
public class Problem050 implements ProjectEulerProblem {

    private final int upperBoundLimit;

    private int terms;

    public Problem050(final int upperBoundLimit) {
        this.upperBoundLimit = upperBoundLimit;
    }

    @Override
    public String solve() {
        final Prime p = new Prime();
        final int[] primes = p.primes(upperBoundLimit);

        final int[] sums = new int[primes.length + 1];
        for (int i = 0; i < primes.length; i++) {
            sums[i + 1] = sums[i] + primes[i];
        }

        int primSum = -1;
        for (int i = 0; i < sums.length; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                final int sum = sums[j] - sums[i];
                final int sumTerms = j - i;
                if (sum >= upperBoundLimit) {
                    break;
                } else if (sumTerms < terms) {
                    continue;
                } else if (p.isPrime(sum)) {
                    terms = sumTerms;
                    primSum = sum;
                }
            }
        }

        return Integer.toString(primSum);
    }

    public int terms() {
        return terms;
    }

}
