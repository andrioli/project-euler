package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem048 {

    @Test
    public void test() {
        // Simple test
        Assert.assertEquals("0405071317", new Problem048(10).solve());

        // Solution of problem 48
        Assert.assertEquals("9110846700", new Problem048(1000).solve());
    }

}
