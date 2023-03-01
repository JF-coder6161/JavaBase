package com.jf.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test01 {

    /**
     * 旧版日期时间设计的问题
     * 1.设计不合理 java.util 和 java.sql 的包中都有日期类
     *            java.util.Date同时包含日期和时间的解析  而 java.sql.Date仅仅包含日期，此外用于格式化和解析的类在java。text包下
     * 2.非线程安全，java.util.Date是非线程安全的，所有的日期类都是可变的，这是java日期类最大的问题之一
     * 3.时区处理麻烦，日期类并不提供国际化，没有时区支持
     */
    @Test
    public void test1() throws ParseException {

        // 1.设计不合理
        Date date = new Date(2021,05,05); //Sun Jun 05 00:00:00 CST 3921
        System.out.println(date);

        // 2.时间格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        // 3.解析操作
        Date parse = simpleDateFormat.parse("2021-05-06"); // Thu May 06 00:00:00 CST 2021
        System.out.println(parse);

        // 时间格式化和解析操作是线程不安全的
        for (int i = 0; i < 50; i++) {
            new Thread(() ->{
                try {
                    System.out.println(simpleDateFormat.parse("2021-05-06"));
                }catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
