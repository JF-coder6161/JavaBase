package com.jf.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Stream<T> sorted(Comparator<? super T> comparator);
 */
public class StreamTest11 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "2", "5", "4", "0");
//        stream1.map(Integer::parseInt)
//                .sorted((o1, o2) -> o2 - o1) // 根据比较器指定排序规则
//                .forEach(System.out::println);

        stream1.map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }
}
