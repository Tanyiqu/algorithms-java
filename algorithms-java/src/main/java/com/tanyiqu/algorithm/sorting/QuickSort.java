package com.tanyiqu.algorithm.sorting;

import java.util.List;

public class QuickSort<E extends Comparable<E>> extends AbstractSort<E> {

    @Override
    String name() {
        return "快速排序";
    }

    @Override
    void sort(E[] array) {
        qsort(array, 0, array.length - 1);
    }

    @Override
    void sort(List<E> list) {
        qsort(list, 0, list.size() - 1);
    }

    /**
     * 快速排序 Array
     * 
     * @param array
     * @param begin
     * @param end
     */
    void qsort(E[] array, int begin, int end) {
        if (end - begin < 2) {
            return;
        }
        int pivot = pivot(array, begin, end);
        qsort(array, begin, pivot - 1);
        qsort(array, pivot + 1, end);
    }

    /**
     * 快速排序 List
     * 
     * @param list
     * @param begin
     * @param end
     */
    void qsort(List<E> list, int begin, int end) {
        if (end - begin < 2) {
            return;
        }
        int pivot = pivot(list, begin, end);
        qsort(list, begin, pivot - 1);
        qsort(list, pivot + 1, end);
    }

    /**
     * 求轴点元素 Array
     * 
     * @param array
     * @param begin
     * @param end
     * @return
     */
    int pivot(E[] array, int begin, int end) {
        E pviot = array[begin];
        while (begin < end) {
            // 右 -> 左
            while (begin < end) {
                if (greaterThan(array[end], pviot)) {
                    end--;
                } else {
                    array[begin] = array[end];
                    begin++;
                    break;
                }
            }
            // 左 -> 右
            while (begin < end) {
                if (lessThan(array[begin], pviot)) {
                    begin++;
                } else {
                    array[end] = array[begin];
                    end--;
                    break;
                }
            }
        }
        array[begin] = pviot;
        return begin;
    }

    /**
     * 求轴点元素 List
     * 
     * @param list
     * @param begin
     * @param end
     * @return
     */
    int pivot(List<E> list, int begin, int end) {
        E pviot = list.get(begin);
        while (begin < end) {
            // 右 -> 左
            while (begin < end) {
                if (greaterThan(list.get(end), pviot)) {
                    end--;
                } else {
                    list.set(begin, list.get(end));
                    begin++;
                    break;
                }
            }
            // 左 -> 右
            while (begin < end) {
                if (lessThan(list.get(begin), pviot)) {
                    begin++;
                } else {
                    list.set(end, list.get(begin));
                    end--;
                    break;
                }
            }
        }
        list.set(begin, pviot);
        return begin;
    }
}