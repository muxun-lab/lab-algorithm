package org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：5367
 * 题目：最长快乐前缀
 * 链接：https://leetcode-cn.com/problems/longest-happy-prefix/
 * 详情：「快乐前缀」是在原字符串中既是非空前缀也是后缀（不包括原字符串自身）的字符串
 * 给你一个字符串s，请你返回它的最长快乐前缀
 * 如果不存在满足题意的前缀，则返回一个空字符串
 * 提示：
 * * 1 <= s.length <= 10^5
 * * s只含有小写英文字母
 * @author sunshine
 * @created 2020-03-22
 */
public class LongestPrefix {

    /**
     * 思路：截取字符串比对
     * 暴力，超出内存限制
     * @param s 给定的字符串
     * @return 给定字符串的最长快乐前缀
     */
    public String longestPrefix(String s) {
        String longestPrefix = "";
        if (s.length() <= 1) {
            return longestPrefix;
        }
        int n = s.length();
        // 求前缀
        List<String> prefixList = new ArrayList<>();
        List<String> suffixList = new ArrayList<>();
        for (int i = 1; i <= n - 1; i++) {
            prefixList.add(s.substring(0, i));
            suffixList.add(s.substring(n - i, n));
        }
        for (int i = 0; i < prefixList.size(); i++) {
            if (prefixList.get(i).equals(suffixList.get(i))) {
                longestPrefix = prefixList.get(i);
            }
        }
        return longestPrefix;
    }

    /**
     * 思路：KMP
     * @param s 给定的字符串
     * @return 给定字符串的最长快乐前缀
     */
    public String longestPrefixOptimize(String s) {
        int[] next = new int[s.length() + 1];
        int i = 0, j = -1;
        next[0] = -1;
        while (i < s.length()) {
            // 已有 [0, ..., j - 1] 与 [i - j, ..., i - 1] 匹配, 同时 s[j] == s[i]
            if (j == -1 || s.charAt(j) == s.charAt(i)) {
                // 匹配长度增加 1, 查看下一个匹配位置
                next[++i] = ++j;
            } else {
                // 不匹配, 说明当前查看的前缀太长, 将j跳回到上一个可能的匹配位置
                j = next[j];
            }
        }
        int n = next[s.length()];
        return s.substring(0, n);
    }

    /**
     * 思路：哈希
     * 由于equals比较会超时，则直接使用hash比较
     * hash比较无需重新计算，当前字符串hash值=前一个前缀的hash值+新添加的字符串
     * @param s 给定的字符串
     * @return 给定字符串的最长快乐前缀
     */
    public String longestPrefixHash(String s) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        int max = 0, prefixHash = 0, suffixHash = 0, size = 1;
        for (int i = 1; i < n; i++, size *= 31) {
            prefixHash = prefixHash * 31 + charArray[i - 1];
            suffixHash = suffixHash + charArray[n - i] * size;
            if (prefixHash == suffixHash) {
                max = i;
            }
        }
        return s.substring(0, max);
    }
}
