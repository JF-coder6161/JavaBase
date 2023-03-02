package com.jf.funref;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 1. instanceName::methodName 对象::方法名
 * 方法引用的注意事项：
 *  1.被引用的方法，参数要和接口中的抽象方法的参数一样
 *  2.当接口抽象方法有返回值时，被引用的方法也必须有返回值
 */
public class FunctionRefTest03 {

    public static void main(String[] args) {

        Date now = new Date();
        Supplier<Long> supplier = () -> {
            return now.getTime();
        };
        System.out.println(supplier.get());
        Supplier<Long> supplier1 = now::getTime;
        System.out.println(supplier1.get());
    }
}
