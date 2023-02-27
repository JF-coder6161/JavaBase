package com.jf.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {


        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.forEach(System.out::print);
        String[] arr2 = {"aa", "bb", "cc"};
        Stream<String> stream3 = Stream.of(arr2);
        stream3.forEach(System.out::print);
        //  注意：基本数据类型的数组是不行的，会按照一个对象进行处理
        int[] arr = {1, 2, 3, 4, 5};
        Stream<int[]> stream2 = Stream.of(arr);
        stream2.forEach(System.out::println); //[I@4eec7777
        Integer[] arr3 = {1, 2, 3, 4, 5};
        Stream<Integer> arr31 = Stream.of(arr3);
        arr31.forEach(System.out::println);

    }
}
