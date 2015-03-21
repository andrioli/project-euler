package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem025 {

    @Test
    public void test() {
        // Simple test
        Assert.assertEquals("12", new Problem025(3).solve());

        // Solution of problem 25
        Assert.assertEquals("4782", new Problem025(1000).solve());
    }

}
