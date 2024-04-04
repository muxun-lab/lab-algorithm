package org.muxun.algorithm.leetcode.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题号: 438
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-all-anagrams-in-a-string">找到字符串中所有字母异位词</a>
 * <p>
 * 详情: 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。
 * <p>
 * 不考虑答案输出的顺序。
 * <p>
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 * @author 慕勋
 * @created 2024/2/16
 */
public class LeetCode438 {

    /**
     * 思路: 双指针
     * 使用数组存储固定窗口内的字母个数，然后判断数组是否相等即可
     * 判断手法非常的巧妙，我的思路是用HashMap比较key和value的值是否相同
     * @param s 指定字符串
     * @param p 异位词
     * @return 异位词索引
     */
    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || s.isEmpty()) {
            return List.of();
        }
        if (s.length() < p.length()) {
            return List.of();
        }
        List<Integer> resList = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) {
            resList.add(0);
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            // 移动左指针
            sCount[s.charAt(i) - 'a']--;
            // 移动右指针
            sCount[s.charAt(i + p.length()) - 'a']++;

            if (Arrays.equals(sCount, pCount)) {
                resList.add(i + 1);
            }
        }
        return resList;
    }
}
