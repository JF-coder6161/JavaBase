package com.jf.stringessence;

public class test02 {

    public static void main(String[] args) {
        /**
         * String类的常用方法
         */


        /**
         * 构造器
         * String str = new String()
         *
         * public String() {
         *         this.value = "".value;
         *     }
         *
         */

        String str = new String();
        String str1 = "";

        /**
         *
         * String str = new String("abc")
         *
         * public String(String original) {
         *         this.value = original.value;
         *         this.hash = original.hash;
         *     }
         */

        /**
         *
         * String str = new String(new char[] {'a','b','c'})
         *
         * public String(char value[]) {
         *         this.value = Arrays.copyOf(value, value.length);
         *     }
         *
         * public static char[] copyOf(char[] original, int newLength) {
         *         char[] copy = new char[newLength];
         *         System.arraycopy(original, 0, copy, 0,
         *                          Math.min(original.length, newLength));
         *         return copy;
         *     }
         */


        /**
         *
         * str = "abc"
         * int length = str.length()
         *
         * public int length() {
         *         return value.length;
         *     }
         *
         *
         * public interface CharSequence {
         *  int length();
         *
         */

        /**
         * str = "abc"
         * str.isEmpty()
         *
         * public boolean isEmpty() {
         *         return value.length == 0;
         *     }
         */

        /**
         * str = "abc"
         * str.charAt(1)
         *
         * public char charAt(int index) {
         *         if ((index < 0) || (index >= value.length)) {
         *             throw new StringIndexOutOfBoundsException(index);
         *         }
         *         return value[index]; // private final char value[];
         *     }
         *
         */



        int n = 2;
        int x = n-- + 1; // 先用再减
        System.out.println(x);
        System.out.println(n);

        int a = 2;
        int b = a++ +1;
        System.out.println(b);
        System.out.println(a);

        System.out.println(str.equals(str)); // true

        String str2 = "abc";  // 97 98 99
        String str3 = "acb";  // 97 99 98
        System.out.println(str2.compareTo(str3));

        String str4 = "abc";  // 97 98 99
        String str5 = "abcd";  // 97 99 98
        System.out.println(str4.compareTo(str5));


    }

}
