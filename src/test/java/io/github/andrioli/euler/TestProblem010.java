package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem010 {

    @Test
    public void test() {
        // 2 + 3 + 5 + 7
        Assert.assertEquals("17", new Problem010(8).solve());

        // Solution of problem 1
        Assert.assertEquals("142913828922", new Problem010(2000000).solve());
    }

}
