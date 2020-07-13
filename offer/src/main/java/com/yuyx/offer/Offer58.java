package com.yuyx.offer;

/**
 * 左旋转字符串
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * @author yuyx
 */
public class Offer58 {

    /**
     * 字符串切片
     * O(n) O(n)
     */
    public String reverseLeftWords0101(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    /**
     * 列表遍历拼接
     * O(n) O(n)
     */
    public String reverseLeftWords0102(String s, int n) {
        return new StringBuilder(s.length()).append(s, n, s.length()).append(s, 0, n).toString();
    }

    /**
     * 字符串遍历拼接
     * 效率低
     * O(n) O(n)
     */
    public String reverseLeftWords0103(String s, int n) {
        String str = "";
        int length = s.length();
        for (int i = n; i < n + length; i++) {
            str += s.charAt(i % length);
        }

        return str;
    }
}
