package com.jf.stream;

import java.util.stream.Stream;

public class StreamTest06 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a1", "b2", "c3");
        stream1.filter(s -> {
                    System.out.println("----");
                    return s.contains("a");
                })
                .forEach(System.out::println);
        System.out.println("------------->");
    }
}
