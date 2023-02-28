package com.jf.optional;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {
    /**
     * Optional是一个没有子类的工具类，Optional是一个可以为null的容器对象，
     * 主要作用就是为了避免Null检查，防止 NullpointerException
     */

    @Test
    public void test1() {

        Optional<String> op1 = Optional.of("Alice");
        //Optional<Object> op2 = Optional.of(null); // Exception  of方法不支持null
        Optional<String> op3 = Optional.ofNullable("Jack");
        Optional<String> op4 = Optional.ofNullable(null);   // ofNullable 支持null

        // 直接创建一个空的Optional对象
        Optional<Object> op5 = Optional.empty();

    }

    /**
     * Optional中的常用方法介绍
     * get 方法 ： 如果Optional 有值，则返回  否则抛异常
     * get方法一般与isPresent方法一块使用
     * isPresent() 判断是否包含值，包含值返回true  否则 false
     * orElse(T t) 如果调用对象包含值，则返回该值，否则返回 t
     * orElseGet(Supplier s) : 如果调用对象包含值，则返回该值，否则返回 lambda表达式的返回值
     * orElseThrow(Supplier s) : 如果调用对象包含值，则返回该值，否则抛错 lambda表达式的返回值
     */
    @Test
    public void test2() throws Exception {
        Optional<String> op1 = Optional.of("Alice");
        Optional<String> op2 = Optional.empty();
        // 获取Optional值
        System.out.println(op1.get());
        //System.out.println(op2.get()); // Exception


        if (op2.isPresent()) {
            System.out.println(op2.get());
        } else {
            System.out.println("op2 是空对象");
        }

        String s1 = op1.orElse("Alice");
        System.out.println(s1);
        String s2 = op2.orElse("Peter");
        System.out.println(s2);

        String s3 = op2.orElseGet(() -> "666");
        System.out.println(s3); // 666

        String s = op2.orElseThrow(() -> new Exception());
        System.out.println(s3); // 666




    }
}
