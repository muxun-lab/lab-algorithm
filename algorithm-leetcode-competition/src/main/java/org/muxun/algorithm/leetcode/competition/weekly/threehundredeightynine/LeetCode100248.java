package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightynine;

/**
 * 题号: 100248
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-389/problems/existence-of-a-substring-in-a-string-and-its-reverse">字符串及其反转中是否存在同一子字符串</a>
 * <p>
 * 详情: 给你一个字符串 s ，请你判断字符串 s 是否存在一个长度为 2 的子字符串，在其反转后的字符串中也出现。
 * <p>
 * 如果存在这样的子字符串，返回 true；如果不存在，返回 false 。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode100248 {

    /**
     * 思路: 暴力解决
     * @param s 字符串
     * @return 是否出现反转后的子串
     */
    public boolean isSubstringPresent(String s) {
        int n = s.length();
        StringBuilder reverse = new StringBuilder(s);
        reverse = reverse.reverse();
        for (int i = 0; i <= n - 2; i++) {
            String substring = s.substring(i, i + 2);
            if (reverse.indexOf(substring) >= 0) {
                return true;
            }
        }
        return false;
    }
}
