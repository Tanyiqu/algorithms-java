package com.tanyiqu.algorithm.sorting;

import java.util.List;

import com.tanyiqu.util.IntegerUtil;

public abstract class AbstractSort<T extends Comparable<T>> {

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

    /**
     * 排序名称
     * 
     * @return 排序名称
     */
    public abstract String name();

    /**
     * 排序函数
     */
    public abstract void sort(T[] array);

    public abstract void sort(List<T> list);

    /**
     * 测试排序
     */
    void testArray(AbstractSort<Integer> abstractSort) {
        Integer[] array = IntegerUtil.randIntegerArray(20, 1, 100);
        IntegerUtil.print(array);
        abstractSort.sort(array);
        IntegerUtil.print(array);
    }

    /**
     * 测试排序
     */
    void testList(AbstractSort<Integer> abstractSort) {
        List<Integer> list = IntegerUtil.randIntegerList(20, 1, 100);
        IntegerUtil.print(list);
        abstractSort.sort(list);
        IntegerUtil.print(list);
    }

}
