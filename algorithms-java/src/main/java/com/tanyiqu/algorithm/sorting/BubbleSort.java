/**
 * 冒泡排序
 */

package com.tanyiqu.algorithm.sorting;

import java.util.List;

import com.tanyiqu.util.IntegerUtil;

public class BubbleSort<E extends Comparable<E>> extends AbstractSort<E> {

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.test(bubbleSort);

        List<Integer> list = IntegerUtil.randIntegerList(12, 10, 100);
        IntegerUtil.print(list);
        bubbleSort.sort(list);
        IntegerUtil.print(list);

    }

    @Override
    void sort(E[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (greaterThan(array[j], array[j + 1])) {
                    E temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    void sort(List<E> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (greaterThan(list.get(j), list.get(j + 1))) {
                    E temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }
}
