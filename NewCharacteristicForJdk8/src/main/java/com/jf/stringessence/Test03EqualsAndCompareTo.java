package com.jf.stringessence;

public class Test03EqualsAndCompareTo {

    public static void main(String[] args) {


        /**
         * String str = "abc";
         * String str1 = "abc";
         * str.equal(str1)
         *
         * public boolean equals(Object anObject) {
         *         if (this == anObject) {
         *             return true;
         *         }
         *         if (anObject instanceof String) {
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         *
         * 步骤：
         *  1、先判断两个字符串的内存地址是否相同
         *  2、再判断参数是否为String类型的实例
         *  3、再判断两个字符数组的长度是否相同
         *  4、再判断两个字符数组对应相同的位置上的字符是否相同
         */


        /**
         * String str = "abc"
         * String str1 = "abc"
         *
         * str.compareTo(str1)
         *
         * public int compareTo(String anotherString) {
         *         int len1 = value.length;
         *         int len2 = anotherString.value.length;
         *         int lim = Math.min(len1, len2);
         *         char v1[] = value;
         *         char v2[] = anotherString.value;
         *
         *         int k = 0;
         *         while (k < lim) {
         *             char c1 = v1[k];
         *             char c2 = v2[k];
         *             if (c1 != c2) {
         *                 return c1 - c2;
         *             }
         *             k++;
         *         }
         *         return len1 - len2;
         *     }
         *
         * 比较步骤：
         *  1.将两个字符数组按位进行比较(比较位数以两个字符数组位数最小的为主) ，相等继续比较，不相等 返回 ASCII码表 差值
         *  2.如果两个字符数组最小位所办含的字符完全相同，那么返回两个字符数组的长度差值
         */



    }


}
