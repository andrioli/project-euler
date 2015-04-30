package io.github.andrioli.euler;

import io.github.andrioli.euler.utils.StringUtils;

/**
 * <p>
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * </p>
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * </p>
 */
public class Problem004 implements ProjectEulerProblem {

    private final int low;

    private final int high;

    public Problem004(final int low, final int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public String solve() {
        int maxValue = 0;

        // brute force approach
        for (int v1 = low; v1 <= high; v1++) {
            for (int v2 = low; v2 <= high; v2++) {
                final int value = v1 * v2;
                if (StringUtils.isPalindrome(Integer.toString(value))) {
                    if (value > maxValue) {
                        maxValue = value;
                    }
                }
            }
        }

        return Integer.toString(maxValue);
    }

}
