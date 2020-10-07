package com.tanyiqu.algorithm.search;

public abstract class AbstractSearch<T extends Comparable<T>> {

    boolean equal(T a, T b) {
        return a.compareTo(b) == 0;
    }

    boolean greaterThan(T a, T b) {
        return a.compareTo(b) > 0;
    }

    boolean greaterThanOrEqual(T a, T b) {
        return a.compareTo(b) >= 0;
    }

    boolean lessThan(T a, T b) {
        return a.compareTo(b) < 0;
    }

    boolean lessThanOrEqual(T a, T b) {
        return a.compareTo(b) <= 0;
    }

}