package com.company;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciEx {
    public static void main(String[] args) {
        int n=100;
        Stream.iterate(new int[]{0,1},s->new int[]{s[1],s[0]+s[1]})
        .limit(100)
        .map(p->p[0])
        .forEach(System.out::println);
    }
}
