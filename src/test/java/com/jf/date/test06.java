package com.jf.date;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class test06 {


    /**
     * 计算日期时间差
     * Duration: 用来计算两个时间差（LocalTime）
     * Period: 用来计算两个日期差
     */
    @Test
    public void test1(){

        // 计算时间差
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(10, 48, 59);

        // Duration 计算时间差
        Duration between = Duration.between(time, now);
        System.out.println(between.toDays());
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toMillis());

        // 计算日期差
        LocalDate now1 = LocalDate.now();
        LocalDate date = LocalDate.of(1997, 12, 4);
        Period period = Period.between(date, now1);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


    }
}
