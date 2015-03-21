package io.github.andrioli.euler.utils;

import java.math.BigInteger;

public class Math {

    private Math() {
        // no instances
    }

    public static BigInteger factorial(final int n) {
        BigInteger factorial = BigInteger.ONE;
        BigInteger inc = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        return factorial;
    }

}
