package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.seq.BigIntFibonacci;
import io.github.andrioli.euler.utils.seq.BigIntSeq;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 *
 * F_n = F_{n−1} + F_{n−2}, where F_1 = 1 and F_2 = 1.
 *
 * Hence the first 12 terms will be:
 *
 * <ul>
 * <li>F_1 = 1</li>
 * <li>F_2 = 1</li>
 * <li>F_3 = 2</li>
 * <li>F_4 = 3</li>
 * <li>F_5 = 5</li>
 * <li>F_6 = 8</li>
 * <li>F_7 = 13</li>
 * <li>F_8 = 21</li>
 * <li>F_9 = 34</li>
 * <li>F_10 = 55</li>
 * <li>F_11 = 89</li>
 * <li>F_12 = 144</li>
 * </ul>
 *
 * The 12th term, F_12, is the first term to contain three digits.
 *
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem025 implements ProjectEulerProblem {

    private final int digits;

    public Problem025(final int digits) {
        this.digits = digits;
    }

    @Override
    public String solve() {
        int i;
        final BigIntSeq fibonacci = new BigIntFibonacci();
        for (i = 1; fibonacci.next().toString().length() < digits; i++);
        return Integer.toString(i);
    }

}
