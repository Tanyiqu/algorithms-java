package com.tanyiqu.algorithm.sorting;

import java.util.List;

import com.tanyiqu.util.IntegerUtil;

public class QuickSort<T extends Comparable<T>> extends AbstractSort<T> {

    @Override
    public String name() {
        return "快速排序";
    }

    @Override
    public void sort(T[] array) {
        qsort(array, 0, array.length);
    }

    @Override
    public void sort(List<T> list) {
        qsort(list, 0, list.size());
    }

    /**
     * 快速排序 Array
     * 
     * @param array
     * @param begin
     * @param end
     */
    void qsort(T[] array, int begin, int end) {
        if (end - begin < 2) {
            return;
        }
        int pivot = pivot(array, begin, end);
        qsort(array, begin, pivot);
        qsort(array, pivot + 1, end);
    }

    /**
     * 快速排序 List
     * 
     * @param list
     * @param begin
     * @param end
     */
    void qsort(List<T> list, int begin, int end) {
        if (end - begin < 2) {
            return;
        }
        int pivot = pivot(list, begin, end);
        qsort(list, begin, pivot);
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
    int pivot(T[] array, int begin, int end) {
        T pviot = array[begin];
        end--;
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
    int pivot(List<T> list, int begin, int end) {
        T pviot = list.get(begin);
        end--;
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