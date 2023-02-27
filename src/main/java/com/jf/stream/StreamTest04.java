package com.jf.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();

        Stream<String> stream = map.keySet().stream(); // key
        Stream<Map.Entry<String, Object>> stream1 = map.entrySet().stream(); // entry
        Stream<Object> stream2 = map.values().stream(); // value

    }
}
