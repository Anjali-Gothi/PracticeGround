package com.company;

import java.util.Scanner;

public class SumOfGcds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        if (__gcd(N, M) == 1l) {
            System.out.println(N + M);
        } else
            System.out.println((N / N) + (M / M));

    }

    static long __gcd(long a, long b) {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return __gcd(a - b, b);

        return __gcd(a, b - a);
    }
}

