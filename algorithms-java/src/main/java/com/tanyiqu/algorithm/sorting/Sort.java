package com.tanyiqu.algorithm.sorting;

import java.util.Arrays;

import com.tanyiqu.util.Comparator;

public abstract class Sort {

    // 默认比较器
    static Comparator comparator = new Comparator();

    // 默认待排序数组
    static int[] array = new int[] { 25, 66, 3, 64, 23, 45, 35, 15, 45, 23, 89, 64 };

    /**
     * 排序函数
     */
    abstract void sort();

    /**
     * 打印当前数组
     */
    void printArray() {
        System.out.println(Arrays.toString(array));
    }

}
