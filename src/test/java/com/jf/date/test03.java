package com.jf.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class test03 {

    /**
     * 日期时间的修改
     */
    @Test
    public void test1(){

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now" + now);

        // 修改日期
        LocalDateTime localDateTime = now.withYear(1998);
        System.out.println(localDateTime); // 1998-03-01T21:15:09.971
        // 修改日期时间，对已存在的localDate对象，创建它的模板，不会修改原来的信息
        System.out.println(now); // 2023-03-01T21:15:09.971

        // 针对当前日期的加减操作
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 3, 1, 5, 30, 50, 0);
        System.out.println(localDateTime1.plusDays(2)); // 2023-03-03T05:30:50

        System.out.println(localDateTime1.minusDays(1)); //2023-02-28T05:30:50

    }

    /**
     * 日期时间的比较
     */
    @Test
    public void test2(){

        LocalDate before = LocalDate.of(2012,12,12);
        LocalDate after = LocalDate.of(2020, 4, 4);

        // JDK8 中要实现日期的比较
        System.out.println(before.isAfter(after)); // false
        System.out.println(before.isBefore(after)); // true
        System.out.println(before.isEqual(after)); // false

    }

}
