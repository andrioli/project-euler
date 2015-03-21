package io.github.andrioli.euler.utils;

public final class StringUtils {

    private StringUtils() {
        // no instances
    }

    public static boolean isPalindrome(final String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
