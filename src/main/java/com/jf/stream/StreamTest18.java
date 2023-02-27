package com.jf.stream;

import com.jf.domain.Person;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *    public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class StreamTest18 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a,b,c");
        Stream<String> stream2 = Stream.of("x", "y", "z");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(System.out::println);


    }
}
