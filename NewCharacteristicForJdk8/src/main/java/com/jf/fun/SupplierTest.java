package com.jf.fun;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Supplier
 * how to use Functional Interface such as Supplier
 * use it to product Data
 * 无参有返回值
 */
public class SupplierTest {

    public static void main(String[] args) {

        fun1(()->{
            int[] arr = {1,5,4};
            Arrays.sort(arr);
            return arr[arr.length-1];
        });

    }

    private static void fun1(Supplier<Integer> supplier){

        // get是一个无参的有返回值的抽象方法
        Integer max = supplier.get();
        System.out.println("max:" + max);

    }

}
