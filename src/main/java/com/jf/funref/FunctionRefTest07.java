package com.jf.funref;

import com.jf.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 5. TypeName[]::new String[] (::new 调用数组的构造器)
 *
 */
public class FunctionRefTest07 {

    public static void main(String[] args) {

        Function<Integer,String[]> function = (len) -> {
            return new String[len];
        };

        System.out.println("数组的长度 : " + function.apply(3).length);

        Function<Integer,String[]> function1 = String[]::new;

        System.out.println("数组的长度 : " + function1.apply(5).length);
    }
}

