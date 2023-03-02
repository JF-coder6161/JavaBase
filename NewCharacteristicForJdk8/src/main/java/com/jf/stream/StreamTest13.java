package com.jf.stream;

import java.util.stream.Stream;

/**
 * boolean anyMatch(Predicate<? super T> predicate);
 * 是否有任意一个满足条件
 * boolean allMatch(Predicate<? super T> predicate);
 * 是否全部满足条件
 * boolean noneMatch(Predicate<? super T> predicate);
 * 是否全部不满足条件
 */
public class StreamTest13 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "1", "5", "4", "1");

        boolean b = stream1.map(Integer::parseInt)
                .allMatch(s -> s > 0);
        System.out.println(b);

        Stream<String> stream2 = Stream.of("1", "1", "5", "4", "1");

        boolean c = stream2.map(Integer::parseInt)
                .anyMatch(s -> s > 4);
        System.out.println(c);

        Stream<String> stream3 = Stream.of("1", "1", "5", "4", "1");
        boolean d = stream3.map(Integer::parseInt)
                .noneMatch(s -> s > 5);
        System.out.println(d);
    }
}
