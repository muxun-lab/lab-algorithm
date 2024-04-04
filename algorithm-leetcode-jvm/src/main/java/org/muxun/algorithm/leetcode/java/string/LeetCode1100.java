package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号: 1100
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/find-k-length-substrings-with-no-repeated-characters">长度为 K 的无重复字符子串</a>
 * <p>
 * 详情: 给你一个字符串 S，找出所有长度为 K 且不含重复字符的子串，请你返回全部满足要求的子串的 数目。
 * @author 慕勋
 * @created 2024-03-27
 */
public class LeetCode1100 {

    /**
     * 思路: 暴力法
     * 使用频率数组，记录字母出现的次数
     * @param s 字符串
     * @param k 子串长度
     * @return 符合条件的子串个数
     */
    public int numKLenSubstrNoRepeats(String s, int k) {
        if (k > 26) {
            return 0;
        }
        int n = s.length();
        int ans = 0;
        for (int i = 0; i <= n - k; i++) {
            int[] freq = new int[26];
            boolean match = true;
            for (int j = i; j < i + k; j++) {
                int index = s.charAt(j) - 'a';
                freq[index]++;
                if (freq[index] > 1) {
                    match = false;
                    break;
                }
            }
            if (match) {
                ans++;
            }
        }
        return ans;
    }
}
