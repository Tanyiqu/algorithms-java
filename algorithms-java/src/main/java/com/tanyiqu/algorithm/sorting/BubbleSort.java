/**
 * 冒泡排序
 */

package com.tanyiqu.algorithm.sorting;

public class BubbleSort extends AbstractSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.test();
    }

    @Override
    public void sort(Integer[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (comparator.moreThan(array[j], array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
