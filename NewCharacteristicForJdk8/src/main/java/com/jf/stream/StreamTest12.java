package com.jf.stream;

import com.jf.domain.Person;

import java.util.stream.Stream;

/**
 * Stream<T> distinct();
 * 使用注意：
 * Stream流中的distinct方法
 * 1.对于基本数据类型是可以直接去重的
 * 2.对于自定义类型需要重写equals 和 hashcode方法 来移除重复元素
 */
public class StreamTest12 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "1", "5", "4", "0");
        stream1.distinct().forEach(System.out::println);

        Stream<Person> stream2 = Stream.of(new Person("Jack", 11), new Person("Alice", 11), new Person("Jack", 11));
        stream2.distinct().forEach(System.out::println);
    }
}
