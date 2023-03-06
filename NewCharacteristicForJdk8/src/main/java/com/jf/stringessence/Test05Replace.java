package com.jf.stringessence;

public class Test05Replace {

    /**
     *
     *  String str = "abc"
     *  str.replace('a','c')
     *
     * public String replace(char oldChar, char newChar) {
     *         if (oldChar != newChar) {
     *             int len = value.length;
     *             int i = -1;
     *             char[] val = value;
     *
     *             while (++i < len) {
     *                 if (val[i] == oldChar) {
     *                     break;
     *                 }
     *             }
     *             if (i < len) {
     *                 char buf[] = new char[len];
     *                 for (int j = 0; j < i; j++) {
     *                     buf[j] = val[j];
     *                 }
     *                 while (i < len) {
     *                     char c = val[i];
     *                     buf[i] = (c == oldChar) ? newChar : c;
     *                     i++;
     *                 }
     *                 return new String(buf, true);
     *             }
     *         }
     *         return this;
     *     }
     *
     */
}
