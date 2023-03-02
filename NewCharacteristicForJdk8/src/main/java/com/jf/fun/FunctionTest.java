package com.jf.fun;

import java.util.function.Function;

/**
 * Function Interface
 * 有参有返回值的接口，Function接口是根据一个类型的数据得到另一个类型的数据，
 * 前者称为前置条件，后者称为后置条件。有参数有返回值
 */
public class FunctionTest {

    public static void main(String[] args) {
        test(msg -> {
            return Integer.parseInt(msg);
        });

        testAndThen(msg1 -> {
            return Integer.parseInt(msg1);
        }, msg2 -> {
            return msg2 * 10;
        });

        testIdentity(msg -> {
            return msg;
        });
    }

    public static void test(Function<String, Integer> function) {

        Integer result = function.apply("66");
        System.out.println("result : " + result);
    }

    public static void testAndThen(Function<String, Integer> f1, Function<Integer, Integer> f2) {

        Integer result = f1.andThen(f2).apply("66");
        System.out.println("result : " + result);

        // 作用顺序与andThen相反
        Integer result1 = f2.compose(f1).apply("66");
        System.out.println("result1 : " + result1);

        // identity是输入什么参数就返回什么参数
    }

    public static void testIdentity(Function<String,String> f1){
        System.out.println(f1);
    }
}
