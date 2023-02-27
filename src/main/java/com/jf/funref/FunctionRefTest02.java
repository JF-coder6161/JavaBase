package com.jf.funref;

import java.util.function.Consumer;

/**
 * 方法引用解决了什么问题
 * 1.为什么要用方法引用？
 * 1.1 lambda 表达式冗余
 * 在使用lambda表达式的时候也会出现代码冗余的情况，例如：用lambda表达式求一个数组的和
 *
 * 方法引用的格式
 * 符号表示: ::
 * 双冒号为方法引用运算符，而它所在的表达式被称为'方法引用'
 *
 * 应用场景：
 *  1.如果lambda表达式所要实现的方案，已经有其他方法存在相同的方案，那么则可以使用方法引用。
 *
 *  常见的引用方式：
 *      方法引用在JDK8中是相当灵活的，有以下几种形式：
 *      1. instanceName::methodName 对象::方法名
 *      2. ClassName::staticMethodName 类名::静态方法
 *      3. ClassName::methodName 类名::普通方法
 *      4. ClassName::new 类名(::new 调用的构造器)
 *      5. TypeName[]::new String[] (::new 调用数组的构造器)
 */
public class FunctionRefTest02 {

    public static void main(String[] args) {

        // :: 方法引用  也是JDK8中的新语法
        printMax(FunctionRefTest02::getTotal);

    }

    /**
     * 求数组中的所有元素的和
     * @param a
     */
    public static void getTotal(int[] a) {
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
