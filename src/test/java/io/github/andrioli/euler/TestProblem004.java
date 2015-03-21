package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem004 {

    @Test
    public void test() {
        // Simple test
        Assert.assertEquals("9009", new Problem004(10, 99).solve());

        // Solution of problem 4
        Assert.assertEquals("906609", new Problem004(100, 999).solve());
    }

}
