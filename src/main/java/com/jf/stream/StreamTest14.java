package com.jf.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Optional<T> findFirst();
 * Optional<T> findAny();
 */
public class StreamTest14 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "1", "5", "4", "1");

        Optional<String> first = stream1.findFirst();
        System.out.println(first.get());

        Stream<String> stream2 = Stream.of("1", "1", "5", "4", "1");
        Optional<String> any = stream2.findAny();
        System.out.println(any.get());
    }
}
