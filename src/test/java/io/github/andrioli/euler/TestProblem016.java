package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem016 {

    @Test
    public void test() {
        // 2^15 = 32768 and 3 + 2 + 7 + 6 + 8 = 26
        Assert.assertEquals("26", new Problem016(2, 15).solve());

        // Solution of problem 16
        Assert.assertEquals("1366", new Problem016(2, 1000).solve());
    }

}
