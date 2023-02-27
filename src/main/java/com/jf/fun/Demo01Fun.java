package com.jf.fun;

public class Demo01Fun {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        testCalculate((anyTheTypeOfIntArray) -> {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        }, arr);

    }

    public static void testCalculate(Operator operator, int[] arr) {

        int num = operator.getNum(arr);
        System.out.println("Sum: " + num);

    }
}

// lambda 表达式使用时不关心接口名，抽象方法名，只关心抽象方法的参数列表和返回值
// Jdk提供了大量常用的函数式接口
@FunctionalInterface
interface Operator {

    int getNum(int[] arr);

}
