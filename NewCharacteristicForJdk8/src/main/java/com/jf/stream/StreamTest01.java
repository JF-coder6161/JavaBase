package com.jf.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice","Alen","Peter","Ben","Pop");

        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("A")){
                list1.add(s);
            }
        }

        List<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length() == 5){
                list2.add(s);
            }
        }

        for (String s : list2) {
            System.out.println(s);
        }
    }
}
