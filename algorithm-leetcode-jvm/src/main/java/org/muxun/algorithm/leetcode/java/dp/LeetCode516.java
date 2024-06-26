package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：516
 * 题目：最长回文子序列
 * 详情：给你一个字符串 s ，找出其中最长的回文子序列，并返回该序列的长度。
 * 子序列定义为：不改变剩余字符顺序的情况下，删除某些字符或者不删除任何字符形成的一个序列。
 */
public class LeetCode516 {

    /**
     * 思路：动态规划
     * 定义：dp[i][j]
     * 如果s[i]=s[j]，那么获得s[i+1,j-1]范围内的最长回文子串后加上这两个即可
     * 如果s[i]!=s[j]，则不可能作为子串，进行下一个索引的探索
     * @param s 字符串
     * @return 最长可删除的回文子串
     */
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
