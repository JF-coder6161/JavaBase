package com.jf.date;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test04 {

    /**
     * 日期的格式化和解析操作
     * java.time.format.DateTimeFormatter
     */
    @Test
    public void test1(){

        LocalDateTime dateTime = LocalDateTime.of(2022, 11, 12, 2, 05, 30);

        // 指定格式
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String format = dateTime.format(isoLocalDateTime);
        System.out.println(format); //2022-11-12T02:05:30

        // ofPattern 方法指定特定的格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = dateTime.format(dateTimeFormatter);
        System.out.println(format1); // 2022-11-12 02:05:30

        //将字符串解析为一个 日期时间类型
        LocalDateTime parseDateTime = LocalDateTime.parse("1997-05-06 22:45:16", dateTimeFormatter);
        System.out.println(parseDateTime); //1997-05-06T22:45:16


    }

}
