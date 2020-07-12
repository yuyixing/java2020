package com.yuyx.offer;

import java.util.Objects;

/**
 * 替换空格
 *
 * @author yuyx
 */
public class Offer05 {

    /***
     * String.replace
     */
    public String replaceSpace0101(String s) {
        if (paramsInvalid(s)) {
            return s;
        }
        return s.replace(" ", "%20");
    }

    /***
     * 先算空格数
     * 从后向前替换
     * O(n) O(n)
     */
    public String replaceSpace0102(String s) {
        if (paramsInvalid(s)) {
            return s;
        }

        char[] chars = s.toCharArray();
        char[] newChars = createNewCharsBaseOfSpaceCount(chars);

        int newCharsLength = newChars.length;
        int charsIndex = chars.length - 1;
        int newCharsIndex = newCharsLength - 1;

        while (charsIndex >= 0) {
            if (Objects.equals(chars[charsIndex], ' ')) {
                newChars[newCharsIndex--] = '0';
                newChars[newCharsIndex--] = '2';
                newChars[newCharsIndex--] = '%';
            } else {
                newChars[newCharsIndex--] = chars[charsIndex];
            }
            charsIndex--;
        }

        return String.valueOf(newChars);
    }

    /***
     * 先算空格数
     * 从前向后替换
     * O(n) O(n)
     */
    public String replaceSpace0103(String s) {
        if (paramsInvalid(s)) {
            return s;
        }

        char[] chars = s.toCharArray();
        char[] newChars = createNewCharsBaseOfSpaceCount(chars);

        int newCharsIndex = 0;

        for (char aChar : chars) {
            if (Objects.equals(aChar, ' ')) {
                newChars[newCharsIndex++] = '%';
                newChars[newCharsIndex++] = '2';
                newChars[newCharsIndex++] = '0';
            } else {
                newChars[newCharsIndex++] = aChar;
            }
        }

        return String.valueOf(newChars);
    }

    private char[] createNewCharsBaseOfSpaceCount(char[] chars) {
        int charsLength = chars.length;

        int spaceCount = 0;
        for (char aChar : chars) {
            if (Objects.equals(aChar, ' ')) {
                spaceCount++;
            }
        }

        return new char[charsLength + spaceCount * 2];
    }

    /***
     * StringBuilder
     * O(n) O(n)
     */
    public String replaceSpace0104(String s) {
        if (paramsInvalid(s)) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /***
     * Split,Join
     */
    public String replaceSpace0105(String s) {
        if (paramsInvalid(s)) {
            return s;
        }

        return String.join("%20", s.split(" "));
    }

    private boolean paramsInvalid(String s) {
        return s == null || s.length() == 0;
    }

}
