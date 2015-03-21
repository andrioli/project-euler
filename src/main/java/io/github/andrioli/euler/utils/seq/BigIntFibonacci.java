package io.github.andrioli.euler.utils.seq;

import java.math.BigInteger;

public class BigIntFibonacci implements BigIntSeq {

    private final BigInteger[] values = { BigInteger.ONE, BigInteger.ONE };

    private int cursor = 0;

    @Override
    public BigInteger next() {
        final int currentCursor = cursor;
        final int nextCursor = cursor ^ 1;

        final BigInteger value = values[currentCursor];

        values[currentCursor].add(values[nextCursor]);
        cursor = nextCursor;

        return value;
    }

}
