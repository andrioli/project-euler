package io.github.andrioli.euler.utils.seq;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFibonacci {

    private Fibonacci f;

    @Before
    public void setUp() {
        f = new Fibonacci();
    }

    @Test
    public void firstTerm() {
        Assert.assertEquals(1, term(1));
    }

    @Test
    public void secondTerm() {
        Assert.assertEquals(2, term(2));
    }

    @Test
    public void thridTerm() {
        Assert.assertEquals(3, term(3));
    }

    @Test
    public void fourthTerm() {
        Assert.assertEquals(5, term(4));
    }

    @Test
    public void fifthTerm() {
        Assert.assertEquals(8, term(5));
    }

    @Test
    public void sixthTerm() {
        Assert.assertEquals(13, term(6));
    }

    @Test
    public void seventhTerm() {
        Assert.assertEquals(21, term(7));
    }

    @Test
    public void eighthTerm() {
        Assert.assertEquals(34, term(8));
    }

    @Test
    public void ninthTerm() {
        Assert.assertEquals(55, term(9));
    }

    @Test
    public void tenthTerm() {
        Assert.assertEquals(89, term(10));
    }

    private int term(final int term) {
        for (int i = 1; i < term; i++) {
            f.next();
        }
        return f.next();
    }

}
