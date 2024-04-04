package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号：28
 * 题目：实现strStr()
 * 详情：
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回 -1。
 * @author 慕勋
 * @created 2020-02-19
 */
public class StrStr {

    /**
     * 思路：偷鸡
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.length() == needle.length() && !haystack.equals(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }

    /**
     * 思路：双指针
     * @param haystack
     * @param needle
     * @return
     */
    public int strStrUpgrade(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.length() == needle.length() && !haystack.equals(needle)) {
            return -1;
        }
        int start = 0;
        int end = needle.length() - 1;
        char left = needle.charAt(0);
        char right = needle.charAt(needle.length() - 1);
        boolean flag = false;
        while (end < haystack.length()) {
            if (haystack.charAt(start) == left && haystack.charAt(end) == right) {
                if (haystack.substring(start, end + 1).equals(needle)) {
                    flag = true;
                    return start;
                } else {
                    start++;
                    end++;
                }
            } else {
                start++;
                end++;
            }
        }
        return flag ? start : -1;
    }
}
