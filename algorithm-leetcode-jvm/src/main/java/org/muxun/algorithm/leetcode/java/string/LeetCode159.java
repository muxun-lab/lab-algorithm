package org.muxun.algorithm.leetcode.java.string;

import java.util.Collections;
import java.util.HashMap;

/**
 * 题号: 159
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/longest-substring-with-at-most-two-distinct-characters">至多包含两个不同字符的最长子串</a>
 * <p>
 * 详情: 给你一个字符串 s ，请你找出 至多 包含 两个不同字符 的最长子串，并返回该子串的长度。
 * @author 慕勋
 * @created 2024/2/24
 */
public class LeetCode159 {

    /**
     * 思路:
     * @param s 字符串
     * @return 子串长度
     */
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() < 3) {
            return s.length();
        }
        int max = 0;
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        while (right < s.length()) {
            int c = s.charAt(right) - 'a';
            indexMap.put(c, right);
            right++;
            if (indexMap.size() == 3) {
                int index = Collections.min(indexMap.values());
                int key = s.charAt(index) - 'a';
                indexMap.remove(key);
                left = index + 1;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
