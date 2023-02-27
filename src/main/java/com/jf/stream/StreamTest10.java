package com.jf.stream;

import java.util.stream.Stream;

/**
 * <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 * 如果我们需要将流中的元素，映射到另一个流中，可以使用map方法
 * 该接口需要一个Function函数式接口参数，可以将当前T类型的数据转换为R类型的数据
 */
public class StreamTest10 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a1", "a2", "a3","a4","a5");
        stream1.map(msg -> msg.substring(1))
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
