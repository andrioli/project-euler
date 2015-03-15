package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem001 {

    @Test
    public void test() {
        // 3
        Assert.assertEquals("3", new Problem001(4).solve());
        // 3 + 5
        Assert.assertEquals("8", new Problem001(6).solve());
        // 3 + 5 + 6 + 9
        Assert.assertEquals("23", new Problem001(10).solve());

        // Solution of problem 1
        Assert.assertEquals("233168", new Problem001(1000).solve());
    }

}
