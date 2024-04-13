package org.muxun.algorithm.leetcode.competition.weekly.threehundredninety;

/**
 * 题号: 100245
 * <p>
 * 链接: <a href="https://leetcode.cn/contest/weekly-contest-390/problems/maximum-length-substring-with-two-occurrences">每个字符最多出现两次的最长子字符串</a>
 * <p>
 * 详情: 给你一个字符串 s ，请找出满足每个字符最多出现两次的最长子字符串，并返回该子字符串的 最大 长度。
 * @author 慕勋
 * @created 2024-03-24
 */
public class LeetCode100245 {

    /**
     * 思路: 记忆化搜索
     * @param s 字符串s
     * @return 最大长度
     */
    public int maximumLengthSubstring(String s) {
        char[] cs = s.toCharArray();
        int n = s.length();
        int ans = 0;
        int left = 0;
        while (left < n) {
            int[] arr = new int[26];
            arr[cs[left] - 'a']++;
            int right = left + 1;
            while (right < n && arr[cs[right] - 'a'] < 2) {
                arr[cs[right] - 'a']++;
                right++;
            }
            ans = Math.max(ans, right - left);
            left++;
        }
        return ans;
    }
}
