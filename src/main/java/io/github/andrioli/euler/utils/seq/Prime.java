package io.github.andrioli.euler.utils.seq;

import java.util.LinkedList;

import br.usp.each.saeg.commons.ArrayUtils;

public class Prime implements IntSeq {

    private final LinkedList<Integer> primes = new LinkedList<>();

    private int current = 2;

    @Override
    public int next() {
        // special case for number 2
        if (current == 2) {
            primes.add(current);
            return current++;
        }

        int n;
        for (n = current; isNotPrime(n); n = n + 2);
        primes.add(n);
        current = n + 2;
        return n;
    }

    public boolean isNotPrime(final int n) {
        final int sqrt = (int) Math.sqrt(n);
        for (final Integer p : primes) {
            if (n % p == 0) {
                return true;
            }
            if (p >= sqrt) {
                break;
            }
        }
        return false;
    }

    public boolean isPrime(final int n) {
        return !isNotPrime(n);
    }

    public int[] primes(final int limitExclusive) {
        int size = primes.size();
        while (current < limitExclusive) {
            next();
            size++;
        }
        if (!primes.isEmpty() && primes.getLast() >= limitExclusive) {
            current = primes.removeLast();
            size--;
        }
        return ArrayUtils.toArray(primes, new int[size]);
    }

}
