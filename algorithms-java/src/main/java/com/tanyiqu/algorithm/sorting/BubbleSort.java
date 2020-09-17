/**
 * 冒泡排序
 */

package com.tanyiqu.algorithm.sorting;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T> {

    @Override
    public String name() {
        return "冒泡排序";
    }

    @Override
    public void sort(T[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (greaterThan(array[j], array[j + 1])) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sort(List<T> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (greaterThan(list.get(j), list.get(j + 1))) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
