package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightynine;

/**
 * 题号: 100236
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-389/problems/count-substrings-starting-and-ending-with-given-character">统计以给定字符开头和结尾的子字符串总数</a>
 * <p>
 * 详情: 给你一个字符串 s 和一个字符 c 。返回在字符串 s 中并且以 c 字符开头和结尾的非空子字符串的总数。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode100236 {

    /**
     * 思路: 求出符合c的个数，然后进行排列组合
     * @param s 字符串
     * @param c 字母
     * @return 非空子字符串的总数
     */
    public long countSubstrings(String s, char c) {
        int n = s.length();
        int count = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                count++;
                ans += count;
            }
        }
        return ans;
    }
}
