package com.tanyiqu.algorithm.sorting;

public class SelectionSort extends AbstractSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.test();
    }

    @Override
    void sort(Integer[] array) {
        int length = array.length;
        for (int end = length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                if (array[begin] > array[maxIndex]) {
                    maxIndex = begin;
                }
            }
            int temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

}