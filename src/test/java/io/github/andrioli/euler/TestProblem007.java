package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem007 {

    @Test
    public void test() {
        // 4th prime
        Assert.assertEquals("7", new Problem007(4).solve());
        // 6th prime
        Assert.assertEquals("13", new Problem007(6).solve());

        // Solution of problem 7
        Assert.assertEquals("104743", new Problem007(10001).solve());
    }

}
