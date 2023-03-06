package com.jf.stringessence;

public class Test06CompileStringMemoryAnalysis {

    public static void main(String[] args) {


        String s1 = "a" + "b" + "c" ;
        String s2 = "ab" + "c";
        String s3 = "abc" + "";

        /**
         * 上面的字符串，会进行反编译器优化，直接合并成为完整的字符串，可以进行反编译验证
         * 再常量池中，常量池的特点：
         *  1、如果没有这个字符串，就放进去
         *  2、如果有这个字符串，不放进去
         *  JDK1.7之后 ，字符串常量池已经移动到内存堆中。
         *  上面的字符串内存地址都指向常量池中唯一一块内存
         */


        String str = new String("abc");

        /**
         * new String("abc")  --> 在堆中开辟了一块空间(str 指向堆中的空间)
         * new String("abc")  --> str底层的char类型的数组，指向字符串常量池中的 "abc" 数组
         * 相当于 new String 创建对象 占用两块空间
         */

        String str1 = "abc";
        String str2 = str1 + "bvd";

        /**
         * 有变量参与的字符串拼接
         * 变量str1 在编译时不知道它指向"abc" ,所以不进行编译器优化，不会直接合并为"abcbvd"
         * 我们用javac反汇编 来看 会借用StringBuilder 来进行字符串拼接
         *
         * Compiled from "Test06CompileStringMemoryAnalysis.java"
         * public class com.jf.stringessence.Test06CompileStringMemoryAnalysis {
         *   public com.jf.stringessence.Test06CompileStringMemoryAnalysis();
         *     Code:
         *        0: aload_0
         *        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         *        4: return
         *
         *   public static void main(java.lang.String[]);
         *     Code:
         *        0: ldc           #2                  // String abc
         *        2: astore_1
         *        3: ldc           #2                  // String abc
         *        5: astore_2
         *        6: ldc           #2                  // String abc
         *        8: astore_3
         *        9: new           #3                  // class java/lang/String
         *       12: dup
         *       13: ldc           #2                  // String abc
         *       15: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
         *       18: astore        4
         *       20: ldc           #2                  // String abc
         *       22: astore        5
         *       24: new           #5                  // class java/lang/StringBuilder
         *       27: dup
         *       28: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
         *       31: aload         5
         *       33: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       36: ldc           #8                  // String bvd
         *       38: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       41: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *       44: astore        6
         *       46: return
         * }
         */





    }


}
