package org.muxun.algorithm.leetcode.java.string;

import java.util.HashMap;

/**
 * 题号：409
 * 题目：最长回文字符串
 * 详情：给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串
 * 注意：
 * 假设字符串的长度不会超过1010
 * @author 慕勋
 * @created 2020-03-19
 */
public class TheLongestPalindrome {

    /**
     * 思路：哈希
     * @param s 给定的字符串
     * @return 最长的回文字符串
     */
    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!frequencyMap.containsKey(current)) {
                frequencyMap.put(s.charAt(i), 0);
            }
            frequencyMap.put(current, frequencyMap.get(current) + 1);
        }
        int max = 0;
        boolean hasOdd = false;
        for (int num : frequencyMap.values()) {
            if ((num & 1) == 1) {
                hasOdd = true;
                max += num - 1;
            } else {
                max += num;
            }
        }
        return hasOdd ? max + 1 : max;
    }
}
