package com.tanyiqu.algorithm.sorting;

import java.util.Arrays;

import com.tanyiqu.util.Comparator;
import com.tanyiqu.util.IntegerUtil;

public abstract class AbstractSort {

    // 默认比较器
    static Comparator comparator = new Comparator();

    // 默认待排序数组
    static Integer[] array = IntegerUtil.randIntegerArray(12, 1, 100);

    
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
