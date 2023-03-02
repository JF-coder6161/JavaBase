package com.jf.stream;

import java.util.stream.Stream;

/**
 * Stream<T> filter(Predicate<? super T> predicate);
 */
public class StreamTest08 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a1", "b2", "c3");
        stream1.filter((s) -> s.contains("1"))
                .forEach(System.out::println); // a1
    }
}
