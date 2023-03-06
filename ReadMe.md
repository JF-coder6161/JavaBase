### Stream API
#### 1.集合处理数据的弊端
当我们在需要对集合中的元素进行操作时，除了必须的添加，删除，获取外，最典型的操作就是集合遍历
针对不同需求多次循环遍历，希望有更高效的处理方式

    Stream更加优雅的解决需求

    2.Stream流的获取方式
        1.根据Collection获取
            首先，java.util.Collection 接口中加入了一个default方法 stream(),也就是说Collection接口下的所有实现都可以通过stream流来
            获取
            Map接口并没有实现Collection接口，此时如何处理？
                可以根据Map获取对应的key value 的集合

        2.根据Stream的of方法
            针对于数组



    3.Stream注意事项
        1.Stream只能操作一次
        2.Stream方法返回的是新的流
        3.Stream不调用终结方法，中间的操作不会执行

    4.Stream常用方法介绍
        1.终结方法(返回值类型不是Stream类型的方法，不再支持链式调用) eg: Count forEach
        2.非终结方法(返回值类型仍然是Stream类型的方法，支持链式调用。)

    StreamTest02.java       filter
    StreamTest03.java       Stream的获取  xxx.Stream() 针对集合
    StreamTest04.java       针对map stream的获取
    StreamTest05.java       Stream.of  针对数组
    StreamTest06.java       filter
    StreamTest07.java       forEach
                                void forEach(Consumer<? super T> action)
                            Count
                                long count();
    StreamTest08.java       Stream<T> filter(Predicate<? super T> predicate);
    StreamTest09.java       limit skip
    StreamTest10.java       map
    StreamTest11.java       sorted
    StreamTest12.java       distinct
    StreamTest13.java       anyMatch allMatch noneMath
    StreamTest14.java       findFirst findAny
    StreamTest15.java       max min
    StreamTest16.java       mapToInt
    StreamTest17.java       reduce
    StreamTest18.java       concat

    4.Stream常用方法介绍
        1.终结方法(返回值类型不是Stream类型的方法，不再支持链式调用) eg: Count forEach
        2.非终结方法(返回值类型仍然是Stream类型的方法，支持链式调用。)

    StreamTest02.java       filter
    StreamTest03.java       Stream的获取  xxx.Stream() 针对集合
    StreamTest04.java       针对map stream的获取
    StreamTest05.java       Stream.of  针对数组
    StreamTest06.java       filter
    StreamTest07.java       forEach
                                void forEach(Consumer<? super T> action)
                            Count
                                long count();
    StreamTest08.java       Stream<T> filter(Predicate<? super T> predicate);
    StreamTest09.java       limit skip
    StreamTest10.java       map
    StreamTest11.java       sorted
    StreamTest12.java       distinct
    StreamTest13.java       anyMatch allMatch noneMath
    StreamTest14.java       findFirst findAny
    StreamTest15.java       max min
    StreamTest16.java       mapToInt
    StreamTest17.java       reduce
    StreamTest18.java       concat

    5.Stream结果收集
        1.结果收集到集合中     com.jf.stream.test01 --> test1
        2.结果收集到数组中     com.jf.stream.test01 --> test2

    6.
      对Stream流中的数据做聚合运算   com.jf.stream.test01
      Stream流分组计算             com.jf.stream.test01
      Stream流分组(多级分组)        com.jf.stream.test01
      对Stream流中的数据做分区操作    com.jf.stream.test01
      对Stream流中的数据进行拼接      com.jf.stream.test01

      并行流 并行流操作               com.jf.stream.test02
      并行流中的数据安全问题 解决方案     com.jf.stream.test03



### 新日期时间API介绍 JDK1.8
  
&emsp;java中使用的历法是ISO 8601日历系统,它是世界民用历法,也就是我们所说的公历.  平年有365天,闰年是366天.此外java8还提供了4套其他历法，分别是
&emsp;&emsp;
* ThaiBuddhistDate:泰国佛教历
* MinguoDate:中华民国历
* JapaneseDate:日本历
* HijrahDate:伊斯兰历


&emsp;jdk 8增加了一套全新的日期时间API
* LocalDate:表示日期，包含年月日，格式为2022-03-16
* LocalTime:表示时间包含时分秒
* LocalDateTime：表示日期时间，包含年月日时分秒
* DateTimeFormatter：日期时间格式化类
* Instant：时间戳，表示一个特定的时间瞬间
* Duration:用于计算2个时间(LocalTime，时分秒)的距离
* Period:用于计算2个日期(LocalDate，年月日)的距离
* ZoneDateTime：包含时区的时间

|类|位置|
|:---:|:---:|
|LocalDateTime|test.java.com.jf.test02|
|日期时间的修改与比较|test.java.com.jf.test03|
|日期的格式化和解析操作|test.java.com.jf.test04|
|时间戳(Instant)|test.java.com.jf.test05|
|计算日期时间差|test.java.com.jf.test06|
|时间矫正器|test.java.com.jf.test07|
|时区操作|test.java.com.jf.test08|
&emsp; 注意：在进行日期时间修改的时候，原来的LocalDate对象是不会被修改，每次操作都是返回了一个新的LocalDate对象，所以在多线程场景下是数据安全的
&emsp; JDK新的日期和时间API的优势：
* 新版日期时间API中，日期和时间对象是不可变，操作日期不会影响原来的值，而是生成一个新的实例
* 提供不同的两种方式，有效的区分了人和机器的操作
* TemporalAdjuster可以更精确的操作日期，还可以自定义日期调整日期
* 线程安全

### JDK8其他新特性
#### 1.重复注解
    自从java5中引入注解以来，注解开始变得非常流行，并在各个框架和项目中被广泛使用。
    不过注解有一个很大的限制是:在同一个地方不能多次使用同一个注解。JDK8引入了重复注解的概念。
    在JDK8中使用@Repeatable注解定义重复注解。
#### 2.类型注解
&emsp; JDK8为@Target元注解新增了两种类型:TYPE_PARAMETER,TYPE_USE.
* TYPE_PARAMETER:表示该注解能写在类型参数的声明中。类型参数声明:<T>
* TYPE_USE: 表示注解可以再任何用到类型的地方使用


### JDK1.8 String类
|类方法|位置|
|:---:|:---:|
|String类特点|java.com.jf.stringessence.test01|
|String类构造方法|java.com.jf.stringessence.test02|
|String类equals和compareTo|com.jf.stringessence.Test03EqualsAndCompareTo|
|String类SubString和Concat|com.jf.stringessence.Test04SubStringAndConcat|
|String类Replace|com.jf.stringessence.Test05Replace|
|String类MemoryAnalysis|com.jf.stringessence.Test06CompileStringMemoryAnalysis|
