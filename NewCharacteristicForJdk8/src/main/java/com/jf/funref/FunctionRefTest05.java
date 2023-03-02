package com.jf.funref;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 3. ClassName::methodName 类名::普通方法
 * Java面向对象中，类名只能调用静态方法，类名引用实例方法是有前提的，实际上是拿第一个参数作为方法的调用者
 */
public class FunctionRefTest05 {

    public static void main(String[] args) {

        Function<String,Integer> function = (msg)->{
            return msg.length();
        };

        System.out.println(function.apply("hello"));

        // 通过方法引用实现
        Function<String,Integer> function1 = String::length;
        System.out.println(function1.apply("hello"));

        BiFunction<String,Integer,String> function2 = String::substring;
        System.out.println(function2.apply("HelloWorld", 5)); // World

    }
}
