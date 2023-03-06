package com.jf.stringessence;

public class Test04SubStringAndConcat {

    /**
     *
     * String str = "abc"
     * str.subString(str,2) // 从 下标为 2 处截取到最后
     * str.subString(str,1,2) // 从下标为1 处截取到下标为 2处(不包含2)  [1,2)
     *
     * public String substring(int beginIndex) {
     *         if (beginIndex < 0) {
     *             throw new StringIndexOutOfBoundsException(beginIndex);
     *         }
     *         int subLen = value.length - beginIndex;
     *         if (subLen < 0) {
     *             throw new StringIndexOutOfBoundsException(subLen);
     *         }
     *         return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);
     *     }
     *
     *     public String(char value[], int offset, int count) {
     *         if (offset < 0) {
     *             throw new StringIndexOutOfBoundsException(offset);
     *         }
     *         if (count <= 0) {
     *             if (count < 0) {
     *                 throw new StringIndexOutOfBoundsException(count);
     *             }
     *             if (offset <= value.length) {
     *                 this.value = "".value;
     *                 return;
     *             }
     *         }
     *         // Note: offset or count might be near -1>>>1.
     *         if (offset > value.length - count) {
     *             throw new StringIndexOutOfBoundsException(offset + count);
     *         }
     *         this.value = Arrays.copyOfRange(value, offset, offset+count);
     *     }
     *
     *      public String substring(int beginIndex, int endIndex) {
     *         if (beginIndex < 0) {
     *             throw new StringIndexOutOfBoundsException(beginIndex);
     *         }
     *         if (endIndex > value.length) {
     *             throw new StringIndexOutOfBoundsException(endIndex);
     *         }
     *         int subLen = endIndex - beginIndex;
     *         if (subLen < 0) {
     *             throw new StringIndexOutOfBoundsException(subLen);
     *         }
     *         return ((beginIndex == 0) && (endIndex == value.length)) ? this
     *                 : new String(value, beginIndex, subLen);
     *     }
     *
     *    .....
     *
     *     public static native void arraycopy(Object src,  int  srcPos,
     *                                         Object dest, int destPos,
     *                                         int length);
     *     最终会调用 System.arraycopy
     *
     *
     *
     */


    /**
     *     字符串拼接:
     *     String str = "abc"
     *     str.concat("abc")
     *
     *     public String concat(String str) {
     *         int otherLen = str.length();
     *         if (otherLen == 0) {
     *             return this;
     *         }
     *         int len = value.length;
     *         char buf[] = Arrays.copyOf(value, len + otherLen);
     *         str.getChars(buf, len);
     *         return new String(buf, true);
     *     }
     */


}
