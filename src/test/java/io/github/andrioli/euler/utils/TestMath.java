package io.github.andrioli.euler.utils;

import org.junit.Assert;
import org.junit.Test;

public class TestMath {

    @Test
    public void testFactorial() {
        Assert.assertEquals(1, Math.factorial(1).intValue());
        Assert.assertEquals(2, Math.factorial(2).intValue());
        Assert.assertEquals(6, Math.factorial(3).intValue());
        Assert.assertEquals(24, Math.factorial(4).intValue());
        Assert.assertEquals(120, Math.factorial(5).intValue());
    }

}
