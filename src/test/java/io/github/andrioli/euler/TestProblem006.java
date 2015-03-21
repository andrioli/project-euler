package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem006 {

    @Test
    public void test() {
        // Simple test
        Assert.assertEquals("2640", new Problem006(1, 10).solve());

        // Solution of problem 6
        Assert.assertEquals("25164150", new Problem006(1, 100).solve());
    }

}
