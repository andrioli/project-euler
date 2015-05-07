package io.github.andrioli.euler;

import java.math.BigInteger;

/**
 * <p>
 * 2<sup>15</sup> = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * </p>
 * <p>
 * What is the sum of the digits of the number 2<sup>1000</sup>?
 * </p>
 */
public class Problem016 implements ProjectEulerProblem {

    private final int base;

    private final int exponent;

    public Problem016(final int base, final int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public String solve() {
        final String result = BigInteger.valueOf(base).pow(exponent).toString();
        final int sum = result.chars().map(ch -> ch - '0').sum();
        return Integer.toString(sum);
    }

}
