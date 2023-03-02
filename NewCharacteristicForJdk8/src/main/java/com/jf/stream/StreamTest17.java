package com.jf.stream;

import com.jf.domain.Person;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *reduce
 */
public class StreamTest17 {
    public static void main(String[] args) {

        Stream<Person> stream2 = Stream.of(new Person("Jack", 11), new Person("Alice", 11), new Person("Jack", 11));

        // 求年龄总和
        Integer reduce = stream2.map(Person::getAge) // 实现数据类型的转换
                .reduce(0, Integer::sum); // 求和
        System.out.println(reduce);

        // 求年龄最大值
        Stream<Person> stream1 = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Jack", 12));
        Optional<Integer> reduce1 = stream1.map(Person::getAge)
                .reduce((x, y) -> x - y > 0 ? x : y);
        System.out.println(reduce1.orElse(null));

        Stream<Person> stream3 = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Jack", 12));
        Integer reduce3 = stream3.map(Person::getAge)
                .reduce(0, Math::max);
        System.out.println(reduce3);

        // 统计字符啊出现的次数
        Integer reduce2 = Stream.of("a", "b", "a", "c").map(s -> "a".equals(s) ? 1 : 0).reduce(0, Integer::sum);
        System.out.println(reduce2); // 2




    }
}
