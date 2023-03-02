package com.jf.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 并行流
 * parallelStream
 * 其实就是一个并行执行的流，它通过默认的ForkJoinPool,可以提高多线程任务速度
 */
public class test02 {

    /**
     * 获取并行流的两种方式
     */
    @Test
    public void test1() {

        List<String> list = new ArrayList<>();

        // 通过list 接口 直接获取并行流
        Stream<String> stringStream = list.parallelStream();

        // 将已有的串行流转换为并行流
        Stream<Integer> parallel = Stream.of(1, 2, 3).parallel();
    }

    /**
     * 并行流操作
     */
    @Test
    public void test2() {
        Stream.of(1, 2, 3,4,5,6)
                .parallel() // 将流转换为并发流，Stream处理的时候会进行多线程处理
                .filter(s -> {
                    System.out.println(Thread.currentThread() + " s= " + s);
                    return s > 2;
                }).count();
    }
}
