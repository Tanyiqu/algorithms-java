package com.tanyiqu.algorithm.sorting;

import java.util.List;

import com.tanyiqu.util.IntegerUtil;

public class SelectionSort<E extends Comparable<E>> extends AbstractSort<E> {

    public static void main(String[] args) {
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.test(selectionSort);

        List<Integer> list = IntegerUtil.randIntegerList(12, 10, 100);
        IntegerUtil.print(list);
        selectionSort.sort(list);
        IntegerUtil.print(list);

    }

    @Override
    void sort(E[] array) {
        int length = array.length;
        for (int end = length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                // >=保证排序的稳定性，但不保证所有的情况都是稳定
                if (greaterThanOrEqual(array[begin], array[maxIndex])) {
                    maxIndex = begin;
                }
            }
            E temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    @Override
    void sort(List<E> list) {
        int length = list.size();
        for (int end = length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                // >=保证排序的稳定性，但不保证所有的情况都是稳定
                if (greaterThanOrEqual(list.get(begin), list.get(maxIndex))) {
                    maxIndex = begin;
                }
            }
            E temp = list.get(end);
            list.set(end, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }

}