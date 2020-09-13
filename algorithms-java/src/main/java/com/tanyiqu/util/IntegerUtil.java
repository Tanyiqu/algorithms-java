package com.tanyiqu.util;

import java.util.Arrays;
import java.util.Random;


public class IntegerUtil {

    public static void main(String[] args) {
        Integer[] array = IntegerUtil.randIntegerArray(12, 10, 100);
        IntegerUtil.print(array);
    }

    /**
     * 返回一个随机的从lower到upper的含有num个元素的整数数组
     * 
     * @param num   元素个数
     * @param lower 下界
     * @param upper 上界
     * @return
     */
    public static Integer[] randIntegerArray(int num, int lower, int upper) {

        Integer[] array = new Integer[num];
        for (int i = 0; i < num; i++) {
            array[i] = randInt(lower, upper);
        }
        return array;
    }

    private static int randInt(int lower, int upper) {
        return new Random().nextInt(upper) % (upper - lower + 1) + lower;
    }

    public static void print(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

}