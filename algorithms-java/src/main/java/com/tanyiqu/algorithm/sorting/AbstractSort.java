package com.tanyiqu.algorithm.sorting;

import com.tanyiqu.util.Comparator;
import com.tanyiqu.util.IntegerUtil;

public abstract class AbstractSort {

    // 默认比较器
    Comparator comparator = new Comparator();

    /**
     * 排序函数
     */
    abstract void sort(Integer[] array);

    /**
     * 测试排序
     */
    void test() {
        Integer[] array = IntegerUtil.randIntegerArray(12, 10, 100);
        IntegerUtil.print(array);
        sort(array);
        IntegerUtil.print(array);
    }

}
