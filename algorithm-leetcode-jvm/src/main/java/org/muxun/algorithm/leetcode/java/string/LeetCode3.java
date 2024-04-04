package org.muxun.algorithm.leetcode.java.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 题号：3
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters">无重复字符的最长子串</a>
 * <p>
 * 详情：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * @author 慕勋
 * @created 2020-02-11
 */
public class LeetCode3 {

    /**
     * 思路：字典表的不重复的特性
     * @param s 给定的字符串
     * @return 无重复字符的最长子串长度
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 如果出现重复字符，则更新左指针的位置
            if (map.containsKey(c)) {
                left = Math.max(map.get(c), left);
            }
            map.put(c, right + 1);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    /**
     * 思路: 双指针
     * @param s 字符串
     * @return 无重复字符的最长子串长度
     */
    public int lengthOfLongestSubstringByDoublePointer(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int n = s.length();
        HashSet<Character> hashSet = new HashSet<>();
        int right = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            // 向右移动一下左指针，开始下一个起始位置的遍历
            if (i != 0) {
                hashSet.remove(s.charAt(i - 1));
            }
            // 向右移动右指针，直到找到和左面子串有重复的
            while (right + 1 < n && !hashSet.contains(s.charAt(right + 1))) {
                hashSet.add(s.charAt(right + 1));
                right++;
            }
            max = Math.max(max, right - i + 1);
        }
        return max;
    }
}
