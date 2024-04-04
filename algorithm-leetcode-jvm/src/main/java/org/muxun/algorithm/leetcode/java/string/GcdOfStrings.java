package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号：1071
 * 题目：字符串的最大公因子
 * 详情：对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2
 * <p>
 * 提示：
 * * 1 <= str1.length <= 1000
 * * 1 <= str2.length <= 1000
 * * str1[i] 和 str2[i] 为大写英文字母
 * @author 慕勋
 * @created 2020-03-12
 */
public class GcdOfStrings {

    /**
     * 思路：
     * @param str1 需要除尽的字符串一
     * @param str2 需要除尽的字符串二
     * @return 能除尽的字符串
     */
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() <= 0 || str2.length() <= 0) {
            return "";
        }
        if (str1.length() == 1 && str2.length() == 1) {
            if (str1.charAt(0) == str2.charAt(0)) {
                return String.valueOf(str1.charAt(0));
            } else {
                return "";
            }
        }
        String substring = "";
        int start = 0;
        int maxSubstringLength = Math.min(str1.length(), str2.length());
        if (str1.length() != str2.length()) {
            // 两个字符串长度不相同时，最长子串不能超过给定字符串的一半大小，要不然必然不能整除
            maxSubstringLength = Math.min(Math.max(str1.length(), str2.length()) / 2, maxSubstringLength);
        }
        while (start < maxSubstringLength) {
            if (str1.charAt(start) != str2.charAt(start)) {
                return "";
            }
            start++;
        }
        substring = str1.substring(0, start);
        while (substring.length() > 0) {
            if (isSub(str1, substring) && isSub(str2, substring)) {
                return substring;
            } else {
                substring = substring.substring(0, substring.length() - 1);
            }
        }
        return substring;
    }

    private boolean isSub(String str, String substring) {
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() <= str.length()) {
            stringBuilder.append(substring);
            if (stringBuilder.toString().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
