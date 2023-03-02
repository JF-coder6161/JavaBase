package com.jf.stream;

import com.jf.domain.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 串行Stream流
 * 即 在一个线程上面执行
 */
public class test01 {

    /**
     * Stream 结果收集到集合中
     */
    @Test
    public void test1() {
        Stream<String> stream = Stream.of("aa", "bb", "cc");
        List<String> collect = Stream.of("aa", "bb", "cc").collect(Collectors.toList());
        System.out.println(collect);

        Set<String> collect1 = Stream.of("aa", "bb", "cc", "aa").collect(Collectors.toSet());
        System.out.println(collect1);

        // 如果需要获取的类型是具体的实现 eg ArrayList HashSet
        ArrayList<String> collect2 = Stream.of("aa", "bb", "cc").collect(Collectors.toCollection(ArrayList::new));

        HashSet<String> collect3 = Stream.of("aa", "bb", "cc", "aa").collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect3); //[aa, bb, cc]
    }

    /**
     * Stream 结果收集到数组中
     */
    @Test
    public void test2() {

        Object[] objects = Stream.of(1, 2, 3, 4, 5).toArray();
        System.out.println(Arrays.toString(objects));

        // 指定返回的数组中的类型
        Integer[] integers = Stream.of(1, 2, 3, 4, 5).toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));

        String[] strings = Stream.of(1, 2, 3, 4, 5)
                .map(String::valueOf)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }

    /**
     * 对Stream流中的数据做聚合运算
     */
    @Test
    public void test3() {
        Optional<Person> maxAge = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Bob", 12))
                .collect(Collectors.maxBy((p1, p2) -> p1.getAge() - p2.getAge()));
        System.out.println("最大年龄 : " + maxAge);

        Optional<Person> minAge = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Bob", 12))
                .collect(Collectors.minBy((p1, p2) -> p1.getAge() - p2.getAge()));
        System.out.println("最小年龄 : " + minAge);

        Integer sumAge = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Bob", 12))
                .collect(Collectors.summingInt(s -> s.getAge()));
        System.out.println("年龄总和 : " + sumAge);

        Double avgAge = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Bob", 12))
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println("年龄平均 : " + avgAge);

        Long collect = Stream.of(new Person("Jack", 10), new Person("Alice", 11), new Person("Bob", 12))
                .filter(p -> p.getAge() > 10)
                .collect(Collectors.counting());
        System.out.println("个数 : " + collect);
    }

    /**
     * Stream流分组计算
     * 根据字段分组
     */
    @Test
    public void test4() {
        Map<String, List<Person>> map1 = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .collect(Collectors.groupingBy(Person::getName));

        map1.forEach((k, v) -> {
            System.out.println("k= " + k + "\t v= " + v);
        });

        Map<String, List<Person>> map2 = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .collect(Collectors.groupingBy(p ->
                        p.getAge() >= 18 ? "成年" : "未成年"
                ));

        map2.forEach((k, v) -> {
            System.out.println("k= " + k + "\t v= " + v);
        });
    }

    /**
     * Stream流分组
     * 多级分组
     * 先根据name分组 后根据 年龄分组
     */
    @Test
    public void test5() {

        Map<String, Map<String, List<Person>>> map = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .collect(Collectors.groupingBy(Person::getName, Collectors.groupingBy(p -> p.getAge() > 18 ? "成年" : "未成年")));

        map.forEach((k, v) -> {
                    System.out.println(k);
                    v.forEach(
                            (k1, v1) -> {
                                System.out.println("\t" + k1 + v1);
                            }
                    );
                }
        );
    }

    /**
     * 对Stream流中的数据做分区操作
     * Collectors.partitioningBy 会根据值是否为true，把集合中的数据分割为两个列表，一个true 一个false
     */
    @Test
    public void test6(){
        Map<Boolean, List<Person>> map = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .collect(Collectors.partitioningBy(p -> p.getAge() > 18));
        map.forEach((k,v) -> System.out.println(k + "\t " + v ));
    }


    /**
     * 对Stream流中的数据进行拼接
     * Collectors.joining会根据给定的字符，拼接流中的数据
     */
    @Test
    public void test7(){

        String str1 = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .map(Person::getName)
                .collect(Collectors.joining());
        System.out.println(str1);

        String str2 = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .map(Person::getName)
                .collect(Collectors.joining("*")); //Jack*Alice*Amy*Jack
        System.out.println(str2);


        String str4 = Stream.of(new Person("Jack", 10), new Person("Alice", 11),
                        new Person("Amy", 12), new Person("Jack", 22))
                .map(Person::getName)
                .collect(Collectors.joining("*","&","$")); //&Jack*Alice*Amy*Jack$
        System.out.println(str4);
    }


}