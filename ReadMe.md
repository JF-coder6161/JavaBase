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

|标题|标题|
|:---:|:---:|
|居左测试文本|居中测试文本|
|日期时间的修改操作|居中测试文本2|
|居左测试文本11|居中测试文本22|
|居左测试文本111|居中测试文本222|

&emsp; 注意：在进行日期时间修改的时候，原来的LocalDate对象是不会被修改，每次操作都是返回了一个新的LocalDate对象，所以在多线程场景下是数据安全的
&emsp; JDK新的日期和时间API的优势：
* 新版日期时间API中，日期和时间对象是不可变，操作日期不会影响原来的值，而是生成一个新的实例
* 提供不同的两种方式，有效的区分了人和机器的操作
* TemporalAdjuster可以更精确的操作日期，还可以自定义日期调整日期
* 线程安全