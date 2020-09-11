package com.tanyiqu.algorithm.sorting;

import com.tanyiqu.util.Comparator;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSort implements Sort {

    int[] array = new int[]{25, 66, 3, 64, 23, 45, 35, 15, 45, 23, 89, 64};
    Comparator comparator = new Comparator();

    @Test
    public void test() {
        System.out.println(Arrays.toString(array));
        sort();
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void sort() {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (comparator.moreThan(array[j], array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
