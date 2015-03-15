package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem002 {

    @Test
    public void test() {
        // 2 + 8 + 34
        Assert.assertEquals("44", new Problem002(34).solve());

        // Solution of problem 2
        Assert.assertEquals("4613732", new Problem002(4000000).solve());
    }

}
