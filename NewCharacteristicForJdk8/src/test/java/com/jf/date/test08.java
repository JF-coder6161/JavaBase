package com.jf.date;


import org.junit.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class test08 {


    @Test
    public void test1(){

        // 获取所有的时区id
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // 获取当前时间 中国使用的 是东8区的时区，比标准时间早8个小时
        LocalDateTime now = LocalDateTime.now();

        // 获取标准时间
        ZonedDateTime standTime = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(standTime);

        /**
         * 时区操作：
         *  使用计算机默认的时区，创建日期时间
         */
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1); // Asia Shanghai

        // 使用指定的时区创建日期时间
        ZonedDateTime jst = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(jst);
    }


}
