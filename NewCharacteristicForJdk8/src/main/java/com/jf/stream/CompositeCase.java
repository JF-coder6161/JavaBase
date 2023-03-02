package com.jf.stream;

import com.jf.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 定义两个集合，然后在集合中存储多个用户名称，然后完成如下操作:
 *  1.第一个队伍只保留姓名长度为3的成员
 *  2.第一个队伍筛选之后只要前三个人
 *  3.第二个队伍只要姓张的成员
 *  4.第二个队伍筛选后，不要前两个人
 *  5.将两个队伍合并为一个队伍
 *  6.根据姓名创建Person对象
 *  7.打印整个队伍的Person信息
 */
public class CompositeCase {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Jack","Ben","Smith","Peter","Alice","John","Nik","Lil","Sam");
        List<String> list2 = Arrays.asList("Lu","Lis","Rose","Bob","Huston","Lisa","Lin","Adm","Abe");

        Stream<String> teamOne = list1.stream().filter(s -> s.length() == 3)
                .limit(3);

        Stream<String> teamTwo = list2.stream().filter(s -> s.length() == 3)
                .skip(2);

        Stream<Person> personStream = Stream.concat(teamOne, teamTwo).map(Person::new);

        personStream.forEach(System.out::println);
    }
}
