package com.jf.stream;

import java.util.stream.Stream;

/**
 * Stream<T> limit(long maxSize);
 * 对流进行截取处理，只取 maxSize个
 * 参数 取负值 报错
 * 取0 则 取出的元素为0
 * <p>
 * Stream<T> skip(long n);
 * 对流进行跳过前面n个元素处理
 */
public class StreamTest09 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a1", "b2", "c3");
        stream1.limit(2)
                .forEach(System.out::println); // a1 b2

        Stream<String> stream2 = Stream.of("a1", "b2", "c3");
        stream2.skip(1)
                .forEach(System.out::println); // b2 c3
    }
}
