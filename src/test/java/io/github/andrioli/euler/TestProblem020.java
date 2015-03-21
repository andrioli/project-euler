package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem020 {

    @Test
    public void test() {
        // 1 + 2 + 0
        Assert.assertEquals("3", new Problem020(5).solve());
        // 3 + 6 + 2 + 8 + 8 + 0 + 0
        Assert.assertEquals("27", new Problem020(10).solve());

        // Solution of problem 20
        Assert.assertEquals("648", new Problem020(100).solve());
    }

}
