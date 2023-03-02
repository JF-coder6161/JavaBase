package com.jf.funref;

import java.util.function.Consumer;

/**
 * 方法引用解决了什么问题
 * 1.为什么要用方法引用？
 * 1.1 lambda 表达式冗余
 * 在使用lambda表达式的时候也会出现代码冗余的情况，例如：用lambda表达式求一个数组的和
 */
public class FunctionRefTest01 {

    public static void main(String[] args) {
        printMax(msg -> {
            // lambda表达式中的代码与getTotal冗余了,这时可以”引用“重复代码
            int sum = 0;
            for (int i : msg) {
                sum += i;
            }
            System.out.println("数组求和 = " + sum);
        });
    }

    /**
     * 求数组中的所有元素的和
     * @param a
     */
    public void getTotal(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("数组求和 = " + sum);
    }

    private static void printMax(Consumer<int[]> consumer) {

        int[] arr = {1, 2, 3, 4, 5};
        consumer.accept(arr);

    }

}
