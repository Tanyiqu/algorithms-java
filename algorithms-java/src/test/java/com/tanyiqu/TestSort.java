package com.tanyiqu;

import java.util.ArrayList;
import java.util.List;

import com.tanyiqu.algorithm.sorting.*;
import com.tanyiqu.util.IntegerUtil;

import org.junit.Test;

@SuppressWarnings("all")
public class TestSort {

    public static void main(String[] args) {
        List<AbstractSort> list = new ArrayList<>();
        list.add(new BubbleSort<>());
        list.add(new SelectionSort<>());
        list.add(new QuickSort<>());
        list.add(new InsertionSort<>());
        test(list);
    }

    static void test(List<AbstractSort> list) {
        Integer[] array = IntegerUtil.randIntegerArray(10000, 1, 50000);

        System.out.println("----------------------------------");
        for (AbstractSort sort : list) {
            Integer[] array2 = IntegerUtil.copy(array);

            long begintime = System.currentTimeMillis();
            sort.sort(array2);
            long endtinme = System.currentTimeMillis();
            long costTime = (endtinme - begintime);

            boolean flag = IntegerUtil.isAscend(array2);
            System.out.println("【" + sort.name() + "】" + flag + " 耗时: " + costTime + "ms");
            System.out.println("----------------------------------");
        }
    }

}