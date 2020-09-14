package com.tanyiqu.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class IntegerUtil {

    public static void main(final String[] args) {
        // Integer[] array = IntegerUtil.randIntegerArray(12, 10, 100);
        // IntegerUtil.print(array);

        final List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        print(list);
    }

    /**
     * 返回一个随机的从lower到upper的含有num个元素的整数数组
     * 
     * @param num   元素个数
     * @param lower 下界
     * @param upper 上界
     * @return
     */
    public static Integer[] randIntegerArray(final int num, final int lower, final int upper) {

        final Integer[] array = new Integer[num];
        for (int i = 0; i < num; i++) {
            array[i] = randInt(lower, upper);
        }
        return array;
    }

    /**
     * 返回一个随机的从lower到upper的含有num个元素的整数列表
     * @param num
     * @param lower
     * @param upper
     * @return
     */
    public static List<Integer> randIntegerList(final int num, final int lower, final int upper) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(randInt(lower, upper));
        }
        return list;
    }

    private static int randInt(final int lower, final int upper) {
        return new Random().nextInt(upper) % (upper - lower + 1) + lower;
    }

    public static void print(final Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(final List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (!list.isEmpty()) {
            sb.append(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                sb.append(", ");
                sb.append(list.get(i));
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

}