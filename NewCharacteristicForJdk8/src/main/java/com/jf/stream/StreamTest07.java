package com.jf.stream;

import java.util.stream.Stream;

/**
 * void forEach(Consumer<? super T> action);
 *
 * long count(); // 该方法返回一个long值代表元素的个数
 */
public class StreamTest07 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a1", "b2", "c3");
        // 接受一个Consumer接口，
        stream1.forEach(System.out::println);

        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> ints = Stream.of(arr);
        System.out.println(ints.count());
    }
}
