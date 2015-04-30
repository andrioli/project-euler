package io.github.andrioli.euler;

/**
 * <p>
 * The sum of the squares of the first ten natural numbers is,
 * </p>
 * <p>
 * 1<sup>2</sup> + 2<sup>2</sup> + ... + 10<sup>2</sup> = 385
 * </p>
 * <p>
 * The square of the sum of the first ten natural numbers is,
 * </p>
 * <p>
 * (1 + 2 + ... + 10)<sup>2</sup> = 55<sup>2</sup> = 3025
 * </p>
 * <p>
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * </p>
 * <p>
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * </p>
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
