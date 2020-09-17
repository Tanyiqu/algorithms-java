/**
 * 选择排序
 */

package com.tanyiqu.algorithm.sorting;

import java.util.List;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T> {

    @Override
    public String name() {
        return "选择排序";
    }

    @Override
    public void sort(T[] array) {
        int length = array.length;
        for (int end = length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                // >=保证排序的稳定性，但不保证所有的情况都是稳定
                if (greaterThanOrEqual(array[begin], array[maxIndex])) {
                    maxIndex = begin;
                }
            }
            T temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    @Override
    public void sort(List<T> list) {
        int length = list.size();
        for (int end = length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                // >=保证排序的稳定性，但不保证所有的情况都是稳定
                if (greaterThanOrEqual(list.get(begin), list.get(maxIndex))) {
                    maxIndex = begin;
                }
            }
            T temp = list.get(end);
            list.set(end, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }
}