package io.github.andrioli.euler.utils;

import org.junit.Assert;
import org.junit.Test;

public class TestStringUtils {

    @Test
    public void testIsPalindrome() {
        // true
        Assert.assertTrue(StringUtils.isPalindrome("1"));
        Assert.assertTrue(StringUtils.isPalindrome("11"));
        Assert.assertTrue(StringUtils.isPalindrome("101"));
        Assert.assertTrue(StringUtils.isPalindrome("1001"));
        Assert.assertTrue(StringUtils.isPalindrome("10101"));

        // false
        Assert.assertFalse(StringUtils.isPalindrome("10"));
        Assert.assertFalse(StringUtils.isPalindrome("110"));
        Assert.assertFalse(StringUtils.isPalindrome("1101"));
        Assert.assertFalse(StringUtils.isPalindrome("11001"));
    }

}
