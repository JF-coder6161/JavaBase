package com.jf.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class test07 {

    /**
     * 时间矫正器
     * 有时需要对日期做如下调整
     * 调整到下个月第一天 。。。 等等
     */
    @Test
    public void test1() {

        LocalDate localDate = LocalDate.of(2022, 12, 2);
        TemporalAdjuster adjuster = (temporal) -> {
            LocalDate date = (LocalDate) temporal;
            return date.withDayOfMonth(2).withMonth(2);
        };
        LocalDate localDate1 = localDate.with(adjuster);
        System.out.println(localDate1); //2022-02-02

        LocalDate localDate2 = localDate.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(localDate2); //2023-01-01

    }

}
