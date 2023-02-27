package com.jf.fun;

import java.awt.print.PrinterGraphics;
import java.util.function.Predicate;

/**
 * Predicate 中的默认方法
 */
public class PredicateDefaultTest {

    public static void main(String[] args) {
        test((msg1) -> {
            return msg1.contains("H");
        }, (msg2)->{
            return msg2.contains("W");
        });
    }


    private static void test(Predicate<String> p1, Predicate<String> p2) {

        // p1 包含 H  p2 包含 W
        boolean res = p1.and(p2).test("Hello");

        // p1 包含 H 或者 p2 包含 W
        boolean res1 = p1.or(p2).test("Hello");

        // p1 不包含 H
        boolean res2 = p1.negate().test("Hello");
        System.out.println(res); // false
        System.out.println(res1); // true
        System.out.println(res2); // false
    }

}
