/**
 * 归并排序
 */

package com.tanyiqu.algorithm.sorting;

import java.util.List;

public class MergeSort<T extends Comparable<T>> extends AbstractSort<T> {

    @Override
    public String name() {
        return "归并排序";
    }

    @Override
    public void sort(T[] array) {
        mergeSort(array, 0, array.length);
    }

    // 归并排序
    private void mergeSort(T[] array, int begin, int end) {
        if (end - begin < 2)
            return;
        int mid = (begin + end) / 2;
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);
        merge(array, begin, mid, end);
    }

    /**
     * 合并 [begin,mid) [mid,end)
     */
    private void merge(T[] array, int begin, int mid, int end) {
        // 定义几个指针
        int li = begin;
        int le = mid - begin;
        int ri = mid;
        int re = end;
        int ai = li;

        // 备份左边数组
        for (int i = li; i < le; i++) {
            
        }

    }

    @Override
    public void sort(List<T> list) {

    }

}