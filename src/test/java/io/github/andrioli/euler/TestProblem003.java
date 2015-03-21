package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem003 {

    @Test
    public void test() {
        // 2 . 2
        Assert.assertEquals("2", new Problem003(4L).solve());
        // 2 . 3 . 3
        Assert.assertEquals("3", new Problem003(18L).solve());
        // 5 . 7 . 13 . 29.
        Assert.assertEquals("29", new Problem003(13195L).solve());

        // Solution of problem 3
        Assert.assertEquals("6857", new Problem003(600851475143L).solve());
    }

}
