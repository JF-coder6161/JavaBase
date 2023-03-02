package com.jf.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test03 {

    /**
     * 并行流中的数据安全问题
     * 丢失数据，出现异常
     */

    @Test
    public void test01() {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        System.out.println(list.size()); // 1000

        List<Integer> listNew = new ArrayList<>();
        list.parallelStream()
                .forEach(listNew::add);

        System.out.println(listNew.size()); // 998
    }

    /**
     * 问题解决方案
     * 1.加同步锁
     */

    @Test
    public void test02() {
        List<Integer> listNew = new ArrayList<>();
        Object obj = new Object();
        IntStream.rangeClosed(1, 1000) // 同步加锁
                .parallel()
                .forEach(s -> {
                    synchronized (obj) {
                        listNew.add(s);
                    }
                });

        System.out.println(listNew.size()); // 1000
    }


    /**
     * 使用线程安全的容器
     */

    @Test
    public void test03() {
        Vector v = new Vector();
        Object obj = new Object();
        IntStream.rangeClosed(1, 1000) // 同步加锁
                .parallel()
                .forEach(s -> {
                    synchronized (obj) {
                        v.add(s);
                    }
                });

        System.out.println(v.size()); // 1000
    }

    /**
     * 将线程不安全的容器，包装为线程安全的容器
     */
    @Test
    public void test04() {
        List<Integer> listNew = new ArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(listNew); // 包装为线程安全的容器
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(synchronizedList::add);
        System.out.println(listNew.size()); // 1000
    }

    /**
     * 通过Stream中的toArray方法或者collect方法来操作就是满足线程安全的要求
     */
    @Test
    public void test05(){
        List<Integer> collect = IntStream.rangeClosed(1, 1000)
                .parallel()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect.size());
    }
}
