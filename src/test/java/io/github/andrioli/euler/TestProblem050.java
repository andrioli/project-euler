package io.github.andrioli.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem050 {

    @Test
    public void test() {
        Problem050 p;

        p = new Problem050(100);
        Assert.assertEquals("41", p.solve());
        Assert.assertEquals(6, p.terms());

        p = new Problem050(1000);
        Assert.assertEquals("953", p.solve());
        Assert.assertEquals(21, p.terms());

        p = new Problem050(1000000);
        Assert.assertEquals("997651", p.solve());
        Assert.assertEquals(543, p.terms());
    }

}
