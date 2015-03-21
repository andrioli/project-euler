package io.github.andrioli.euler;

/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
public class Problem006 implements ProjectEulerProblem {

    private final int lowerBoundLimit;

    private final int upperBoundLimit;

    public Problem006(final int lowerBoundLimit, final int upperBoundLimit) {
        this.lowerBoundLimit = lowerBoundLimit;
        this.upperBoundLimit = upperBoundLimit;
    }

    @Override
    public String solve() {
        int sumOfSquares = 0;
        int sum = 0;
        for (int n = lowerBoundLimit; n <= upperBoundLimit; n++) {
            sumOfSquares += n * n;
            sum = sum + n;
        }
        final int squareOfSum = sum * sum;
        return Integer.toString(squareOfSum - sumOfSquares);
    }

}
