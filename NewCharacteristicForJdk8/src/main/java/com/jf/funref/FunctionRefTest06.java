package com.jf.funref;

import com.jf.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * 4. ClassName::new 类名(::new 调用的构造器)
 * 由于构造器的名称和类名完全一致，所以构造器引用使用 :: new 的格式
 */
public class FunctionRefTest06 {

    public static void main(String[] args) {

        Supplier<Person> supplier = () -> {
            return new Person();
        };
        System.out.println(supplier.get());

        // 通过方法引用实现
        Supplier<Person> supplier1 = Person::new;

        BiFunction<String,Integer,Person> function = Person::new;

        System.out.println(function.apply("Jack", 33));


    }
}
