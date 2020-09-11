package com.tanyiqu.util;

import org.junit.Test;

/**
 * 比较器
 */
public class Comparator {

    @Test
    public void test() {
        System.out.println(compare(1, 1));
        System.out.println(lessThan(1, 2));
        System.out.println(moreThan(1, 2));
    }

    public Comparator() {

    }


    public int compare(double a, double b) {
        if (a == b) {
            return 0;
        }
        return a > b ? 1 : -1;
    }


    public boolean lessThan(double a, double b) {
        return compare(a, b) < 0;
    }

    public boolean moreThan(double a, double b) {
        return compare(a, b) > 0;
    }

}
