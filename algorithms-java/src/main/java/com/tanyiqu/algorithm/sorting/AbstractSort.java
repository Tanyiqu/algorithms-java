package com.tanyiqu.algorithm.sorting;

import java.util.List;

import com.tanyiqu.util.IntegerUtil;

public abstract class AbstractSort<E extends Comparable<E>> {

    boolean equal(E a, E b) {
        return a.compareTo(b) == 0;
    }

    boolean greaterThan(E a, E b) {
        return a.compareTo(b) > 0;
    }

    boolean greaterThanOrEqual(E a, E b) {
        return a.compareTo(b) >= 0;
    }

    boolean lessThan(E a, E b) {
        return a.compareTo(b) < 0;
    }

    boolean lessThanOrEqual(E a, E b) {
        return a.compareTo(b) <= 0;
    }

    /**
     * 排序名称
     * 
     * @return 排序名称
     */
    abstract String name();

    /**
     * 排序函数
     */
    abstract void sort(E[] array);

    abstract void sort(List<E> list);

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
