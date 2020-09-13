package com.tanyiqu.algorithm.sorting;

import com.tanyiqu.util.IntegerUtil;

public abstract class AbstractSort<E extends Comparable<E>> {

    boolean greaterThan(E a, E b) {
        return a.compareTo(b) > 0;
    }

    boolean greaterThanOrEqual(E a, E b) {
        return a.compareTo(b) >= 0;
    }

    /**
     * 排序函数
     */
    abstract void sort(E[] array);

    /**
     * 测试排序
     */
    void test(AbstractSort<Integer> abstractSort) {
        Integer[] array = IntegerUtil.randIntegerArray(12, 10, 100);
        IntegerUtil.print(array);
        abstractSort.sort(array);
        IntegerUtil.print(array);
    }

}
