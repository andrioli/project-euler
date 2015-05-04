package io.github.andrioli.euler;

import java.math.BigInteger;

/**
 * <p>
 * The series, 1<sup>1</sup> + 2<sup>2</sup> + 3<sup>3</sup> + ... +
 * 10<sup>10</sup> = 10405071317.
 * </p>
 * <p>
 * Find the last ten digits of the series, 1<sup>1</sup> + 2<sup>2</sup> +
 * 3<sup>3</sup> + ... + 1000<sup>1000</sup>.
 * </p>
 */
public class Problem048 implements ProjectEulerProblem {

    private final int upperBoundLimit;

    public Problem048(final int upperBoundLimit) {
        this.upperBoundLimit = upperBoundLimit;
    }

    @Override
    public String solve() {
        BigInteger value = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        for (int i = 1; i <= upperBoundLimit; i++) {
            value = value.add(current.pow(i));
            current = current.add(BigInteger.ONE);
        }
        final String str = value.toString();
        return str.substring(str.length() - 10);
    }

}
