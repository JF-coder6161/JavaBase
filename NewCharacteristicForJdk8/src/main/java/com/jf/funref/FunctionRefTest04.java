package com.jf.funref;

import java.util.function.Supplier;

/**
 * 2. ClassName::staticMethodName 类名::静态方法
 */
public class FunctionRefTest04 {

    public static void main(String[] args) {

        Supplier<Long> supplier = ()->{
           return System.currentTimeMillis();
        };

        System.out.println(supplier.get());

        Supplier<Long> supplier1 = System::currentTimeMillis;

        System.out.println(supplier1.get());

    }
}
