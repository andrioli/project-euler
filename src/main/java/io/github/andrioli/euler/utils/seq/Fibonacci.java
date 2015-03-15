package io.github.andrioli.euler.utils.seq;

public class Fibonacci implements IntSeq {

    private final int[] values = { 1, 2 };

    private int cursor = 0;

    @Override
    public int next() {
        final int currentCursor = cursor;
        final int nextCursor = cursor ^ 1;

        final int value = values[currentCursor];

        values[currentCursor] += values[nextCursor];
        cursor = nextCursor;

        return value;
    }

}
