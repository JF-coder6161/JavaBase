package com.jf.stream;

import java.util.stream.Stream;

/**
 *     IntStream mapToInt(ToIntFunction<? super T> mapper);
 */
public class StreamTest16 {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 7, 5, 6);

        stream.forEach(System.out::println);

        // Integer 占用内存比int多很多，在Stream流操作过程中会自动装箱和拆箱操作
        // 为了提高程序代码的效率，我们可以先将流种的Integer数据转换为int数据，然后再操作

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 7, 5, 6);

        stream1.mapToInt(Integer::intValue)
                .forEach(System.out::println);
    }
}
