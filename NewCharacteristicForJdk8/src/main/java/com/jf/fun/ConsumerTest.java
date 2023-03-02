package com.jf.fun;

import java.util.function.Consumer;

/**
 * Consumer
 * how to use Functional Interface such as Consumer
 * use it to consumer data
 * 有参无返回值
 */
public class ConsumerTest {

    public static void main(String[] args) {
//        testConsumer(msg -> {
//            System.out.println("res : " + msg.toLowerCase());
//        });

        testConsumerAndThen(msg1->{
            System.out.println("msg1 : " + msg1.toLowerCase());
        },msg2 ->{
            System.out.println("msg2 : "+ msg2.toUpperCase());
        });

    }

    public static void testConsumer(Consumer<String> consumer){

        consumer.accept("Hello World");



    }

    public static void testConsumerAndThen(Consumer<String> c1,Consumer<String> c2){
        String str = "Hello word";
//        // 转小写
//        c1.accept(str);
//        // 转大写
//        c2.accept(str);
        /**
         * 一个方法的参数和返回值都是Consumer类型，那么就可以实现，消费一个数据的时候，首先做一个操作，然后再做一个操作，实现组合(即 andThen方法)
         */
        c1.andThen(c2).accept(str);

    }

}
