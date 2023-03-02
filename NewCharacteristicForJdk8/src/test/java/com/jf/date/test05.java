package com.jf.date;

import org.junit.Test;

import java.time.Instant;

/**
 * Instant类 时间戳 / 时间线
 * 内部保存了从1970年1月1日 00：00：00以来的秒和纳秒
 */

public class test05 {

    /**
     * Instant  统计时间消耗
     */
    @Test
    public void test1() throws InterruptedException {

        Instant now = Instant.now();
        System.out.println(now); //2023-03-01T13:40:08.612Z

        // 获取从格林威治时间起点到现在的 纳秒
        System.out.println(now.getNano());

        Thread.sleep(5);

        //
        int nano = Instant.now().getNano();

        System.out.println("时间差: " + (nano - now.getNano()) );


    }

}
