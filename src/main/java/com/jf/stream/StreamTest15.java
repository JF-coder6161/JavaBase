package com.jf.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 Optional<T> max(Comparator<? super T> comparator);
 Optional<T> min(Comparator<? super T> comparator);
 */
public class StreamTest15 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "2", "5", "4", "1");
        Optional<Integer> max1 = stream1.map(Integer::parseInt)
                /**
                 * (c1, c2) -> Integer.
                 *          compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
                 */
                .max(Comparator.comparingInt(o -> o));
        System.out.println(max1.get());

        Stream<String> stream2 = Stream.of("1", "2", "5", "4", "1");
        Optional<Integer> min2 = stream2.map(Integer::parseInt)
                .min((o1, o2) -> o1 - o2);
        System.out.println(min2.get());

    }
}
