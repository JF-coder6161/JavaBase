package com.jf.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class test02 {


    @Test
    public void test1() {

        // 创建指定日期
        LocalDate date1 = LocalDate.of(2022, 05, 06);
        System.out.println(date1);

        // 获取当前日期
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 获取对应的日期信息
        System.out.println(now.getYear());
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek().getValue());
    }

    @Test
    public void test2() {

        // 得到指定时间
        LocalTime time = LocalTime.of(5, 26, 30, 1121);
        System.out.println(time);

        // 获取当前时间
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // 获取时间信息
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano()); // 纳秒

    }

    /**
     * 日期时间类型 LocalDateTime
     */
    @Test
    public void test3() {

        //获取指定的日期时间
        LocalDateTime dateTime = LocalDateTime.of(2023
                , 3
                , 1
                , 5
                , 5
                , 5
                , 5);

        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 获取日期时间信息
        System.out.println(now.getYear());

    }

}
