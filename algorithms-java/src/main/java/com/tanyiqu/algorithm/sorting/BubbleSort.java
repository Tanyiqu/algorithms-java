/**
 * 冒泡排序
 */

package com.tanyiqu.algorithm.sorting;

public class BubbleSort<E extends Comparable<E>> extends AbstractSort<E> {

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.test(bubbleSort);

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
}
