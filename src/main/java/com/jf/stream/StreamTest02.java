package com.jf.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Alen", "Peter", "Ben", "Pop");

        list.stream()
                // 过滤
                .filter(msg -> msg.startsWith("Alice"))
                // 过滤
                .filter(msg -> msg.length() == 5)
                // 遍历
                .forEach(msg -> System.out.println(msg));

        list.stream()
                .filter(msg -> msg.startsWith("Alice"))
                .filter(msg -> msg.length() == 5)
                // 简化写法
                .forEach(System.out::println);
    }
}
