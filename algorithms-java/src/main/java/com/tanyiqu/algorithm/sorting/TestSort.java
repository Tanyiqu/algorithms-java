package com.tanyiqu.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

import com.tanyiqu.util.IntegerUtil;

@SuppressWarnings("all")
public class TestSort {

    public static void main(String[] args) {
        List<AbstractSort> list = new ArrayList<>();
        list.add(new BubbleSort<>());
        list.add(new SelectionSort<>());
        list.add(new QuickSort<>());
        test(list);
    }

    static void test(List<AbstractSort> list) {
        Integer[] array = IntegerUtil.randIntegerArray(10000, 1, 10000);
        System.out.println("----------------------------------");
        for (AbstractSort sort : list) {

            long begintime = System.currentTimeMillis();
            sort.sort(array);
            long endtinme = System.currentTimeMillis();
            long costTime = (endtinme - begintime);

            boolean flag = IntegerUtil.isAscend(array);
            System.out.println("【" + sort.name() + "】" + flag + " 耗时: " + costTime + "ms");
            System.out.println("----------------------------------");
        }
    }

}