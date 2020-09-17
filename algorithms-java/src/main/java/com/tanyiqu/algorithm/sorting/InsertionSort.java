/**
 * 插入排序
 */

package com.tanyiqu.algorithm.sorting;

import java.util.List;

public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T> {

    @Override
    public String name() {
        return "插入排序";
    }

    @Override
    public void sort(T[] array) {
        for (int begin = 1; begin < array.length; begin++) {
            int currIndex = begin;
            while (currIndex > 0 && lessThan(array[currIndex], array[currIndex - 1])) {
                // 交换
                T temp = array[currIndex];
                array[currIndex] = array[currIndex - 1];
                array[currIndex - 1] = temp;
                currIndex--;
            }
        }
    }

    @Override
    public void sort(List<T> list) {
        for (int begin = 1; begin < list.size(); begin++) {
            int currIndex = begin;
            while (currIndex > 0 && lessThan(list.get(currIndex), list.get(currIndex - 1))) {
                // 交换
                T temp = list.get(currIndex);
                list.set(currIndex, list.get(currIndex - 1));
                list.set(currIndex - 1, temp);
                currIndex--;
            }
        }
    }
}