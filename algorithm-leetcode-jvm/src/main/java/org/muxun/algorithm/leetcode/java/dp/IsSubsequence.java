package org.muxun.algorithm.leetcode.java.dp;

/**
 * 题号：392
 * 题目：判断子序列
 * 详情：给定字符串s和t，判断s是否为t的子序列
 * 你可以认为s和t中仅包含英文小写字母。字符串t可能会很长（长度 ~= 500,000），而s是个短字符串（长度 <=100）。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）
 * <p>
 * 后续挑战 :
 * 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列
 * 在这种情况下，你会怎样改变代码？
 * @author 慕勋
 * @created 2020-03-14
 */
public class IsSubsequence {

    /**
     * 思路：常规解法，截取字符串
     * @param s 子序列字符串
     * @param t 包含子序列的字符串
     * @return s是否是t的子序列
     */
    public boolean isSubsequence(String s, String t) {
        if (s.length() <= 0) {
            return true;
        }
        if (t.length() <= 0) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }
        int sIndex = 0;
        int tIndex = 0;
        while (true) {
            if (sIndex == s.length()) {
                return true;
            }
            String current = String.valueOf(s.charAt(sIndex));
            tIndex = t.indexOf(current, tIndex);
            if (tIndex == -1) {
                return false;
            }
            sIndex++;
            tIndex++;
        }
    }

    /**
     * 思路：动态规划
     * 状态定义：dp[i][j]是为s的从头开始的子字符串是否为t从头开始的子字符串的子序列
     * 转移方程：* char[i] == char[j]: 字符i一定是j的子序列，
     * 如果0~i-1是0~j-1子字符串的子序列，则dp[i][j]=true所以dp[i]=dp[i-1][j-1]
     * * 当char[i] != char[j]: 判断当前0~i子字符串是否是0~j-1子字符串的子序列，即dp[i][j] = dp[i][j-1]
     * 如"ab", "eabc"，虽然s的最后一个字符串和t的最后一个字符串不相等，但是s属于j-1子序列的子字符串，所以s是t的子序列
     * 初始状态：空字符串一定是t的子序列，dp[0][j] = true
     * 返回值：dp[len(s)][len(t)]
     * @param s 子序列字符串
     * @param t 包含子序列的字符串
     * @return s是否是t的子序列
     */
    public boolean isSubsequenceDynamicProgramming(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];
        for (int j = 0; j < t.length(); j++) {
            dp[0][j] = true;
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
